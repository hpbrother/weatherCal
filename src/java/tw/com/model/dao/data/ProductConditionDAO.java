/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.model.dao.data;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.json.JSONArray;
import org.json.JSONObject;
import tw.com.mode.vo.ProductCondition;
import tw.com.mode.vo.ProductConditionId;
import tw.com.mode.vo.ProductMaster;
import tw.com.mode.vo.ProductMasterId;
import tw.com.mode.vo.ProjectMaster;
import tw.com.mode.vo.ProjectMasterId;

import tw.com.mode.vo.WeatherCalVo;
import tw.com.model.base.BaseDAO;
import tw.com.model.base.HibernateUtil;

/**
 *
 * @author Jean
 */
public class ProductConditionDAO {

    public static Calendar calendar = Calendar.getInstance();

  
    public void saveProductCondition(List<ProductCondition> listProductCondition) {
      Session session = HibernateUtil.getSessionFactory().openSession();
      try {
        session.beginTransaction(); //開啟交易
        
        for (int i = 0 ; i < listProductCondition.size() ; i++) {
            session.save(listProductCondition.get(i));
        }
      
          
           
        } catch (Exception e) {
           e.printStackTrace();
            //return null;
        } finally {
          

            session.getTransaction().commit();
            session.close();
        
        }     
    }
    public List gogo() {
       Session session = HibernateUtil.getSessionFactory().openSession();
      // Session sessionHist = HibernateUtil.getSessionFactoryHist().openSession();
      try {
      //  sessionHist.beginTransaction(); //開啟交易
        session.beginTransaction(); //開啟交易
     
      
           ProductMasterId pmid = new ProductMasterId();
           ProductMaster pm = new ProductMaster();
           pmid.setCstProductId("ab");
           pmid.setProductId("ab");
           pmid.setProjectCode("ab");           
           pm.setId(pmid);
           pm.setCstProductDec("bb");           
           session.save(pm);
           //=======
           ProjectMasterId pjmid = new ProjectMasterId();
           ProjectMaster pjm = new ProjectMaster();
           pjmid.setCustomerId("x");
           pjmid.setInsuranceId("x");
           pjmid.setProjectCode("x");
           pjm.setId(pjmid);
           session.save(pjm);
           //======
           ProductCondition pc = new ProductCondition();
           ProductConditionId pcid = new ProductConditionId();
           
           pcid.setProdCondition(1);
           pcid.setProductId("g");
           
           pc.setId(pcid);
           session.save(pc);
           
        } catch (Exception e) {
           e.printStackTrace();
            //return null;
        } finally {
          

          session.getTransaction().commit();
            session.close();
            
          //  sessionHist.getTransaction().commit();
           // sessionHist.close();
        }
        return  null;
    }
    @SuppressWarnings("unchecked")
    public static <T extends List<?>> T cast(Object obj) {
        return (T) obj;
    }

}
