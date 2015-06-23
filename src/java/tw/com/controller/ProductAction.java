/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.json.JSONArray;
import org.json.JSONObject;
import tw.com.mode.vo.ProductCondition;
import tw.com.mode.vo.ProductConditionId;
import tw.com.mode.vo.ProductMaster;
import tw.com.model.dao.data.ProductConditionDAO;
import tw.com.model.dao.data.ProductService;

/**
 *
 * @author hpbrother
 */
public class ProductAction extends ActionSupport {

    private List<ProductMaster> listProductMaster;
    private ProductMaster objPoductMaster;
    private Map<String, Object> jsonDataMap;

    public Map<String, Object> getJsonDataMap() {
        return jsonDataMap;
    }

    public void setJsonDataMap(Map<String, Object> jsonDataMap) {
        this.jsonDataMap = jsonDataMap;
    }

    public List<ProductMaster> getListProductMaster() {
        return listProductMaster;
    }

    public void setListProductMaster(List<ProductMaster> listProductMaster) {
        this.listProductMaster = listProductMaster;
    }

    public ProductMaster getObjPoductMaster() {
        return objPoductMaster;
    }

    public void setObjPoductMaster(ProductMaster objPoductMaster) {
        this.objPoductMaster = objPoductMaster;
    }

    public String showProductInfo() {
        ProductService pService = new ProductService();

        listProductMaster = pService.findProductMasterByStatusAndPage("0", 1);

        return "success";
    }

    public String ajaxSetProductOnOff() {

        jsonDataMap = new HashMap<String, Object>();
        try {
            ProductService pService = new ProductService();
            HttpServletRequest request = ServletActionContext.getRequest();
            String productId = request.getParameter("productId");
            String status = request.getParameter("status");

            ProductMaster obj = pService.findProductmasterByProductId(productId);
            obj.setProductStatus(status);

            objPoductMaster = pService.modifyProductMaster(obj);

            jsonDataMap.put("ret", "t");
            jsonDataMap.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            jsonDataMap.put("ret", "f");
            jsonDataMap.put("success", false);
        }

        return "ajaxSuccess";
    }

    public String FspAssureProductCreat() {
        jsonDataMap = new HashMap<String, Object>();
        String retdata = "";

        HttpServletRequest request = ServletActionContext.getRequest();
        String jsonData = request.getParameter("piProduct");
        //1. 讀取JSON資料 //2. 新增到DB//3. 回傳資訊
        try {
            ProductConditionDAO pcDao = new ProductConditionDAO();

            JSONObject jsonObj = new JSONObject(jsonData);
            JSONObject piProductH = (JSONObject) jsonObj.get("piProductH");
            JSONArray piProductI = (JSONArray) jsonObj.get("piProductI");

            //piProductH
            String assessmentYears = piProductH.get("assessmentYears").toString();
            String elementMethod = piProductH.get("elementMethod").toString();
            String eventDescription = piProductH.get("eventDescription").toString();
            String eventId = piProductH.get("eventId").toString();
            String eventSDescription = piProductH.get("eventSDescription").toString();
            String eventValidEnd = piProductH.get("eventValidEnd").toString();
            String eventValidFrom = piProductH.get("eventValidFrom").toString();
            String operationRunningDays = piProductH.get("operationRunningDays").toString();
            String pkiCode = piProductH.get("pkiCode").toString();
            String productId = piProductH.get("productId").toString();
            String productName = piProductH.get("productName").toString();
            String returnVariable = piProductH.get("returnVariable").toString();
            String runningDays = piProductH.get("runningDays").toString();
            String statisticMethod = piProductH.get("statisticMethod").toString();

            List<ProductCondition> listPC = new ArrayList();
            for (int i = 0; i < piProductI.length(); i++) {
                JSONObject obj = (JSONObject) piProductI.get(i);

                ProductConditionId pcId = new ProductConditionId();
                ProductCondition pc = new ProductCondition();
                //piProductI
                String measureUnit = obj.get("measureUnit").toString();
                
                retdata += measureUnit+",";
                String meteroElement = obj.get("meteroElement").toString();
                String operationGrade = obj.get("operationGrade").toString();
                String operationLb = obj.get("operationLb").toString();
                String operationUb = obj.get("operationUb").toString();
                String phenomenaId = obj.get("phenomenaId").toString();
                String trigerPointLb = obj.get("trigerPointLb").toString();
                String trigerPointUb = obj.get("trigerPointUb").toString();

                pcId.setProdCondition(0);
                pcId.setProductId(productId);

                pc.setId(pcId);
                pc.setMeasureUnit(measureUnit);
                pc.setOperationLb(operationLb);
                pc.setOperationUb(operationUb);
                pc.setPhenomenaId(phenomenaId);
                //pc.setTrigerPointLb(Float.valueOf(trigerPointLb));
                //pc.setTrigerPointUb(Float.valueOf(trigerPointUb));

                listPC.add(pc);
            }
            pcDao.saveProductCondition(listPC);

            
            jsonDataMap.put("ret", "measureUnits:"+retdata);
            jsonDataMap.put("success", true);
            
        } catch (Exception e) {
            e.printStackTrace();
            
            jsonDataMap.put("ret", "f");
            jsonDataMap.put("success", false);
        }

        
        return "success";
    }    

}
