<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .ct {
                margin-left: 20px;
            }
        </style>
    </head>
    <body>
       <div>TODO write content</div>
        <div>
            <h3>1. 模擬取得JSON</h3>
            <div class="ct">
            FspAssureProductCreat?piProduct=......</br>
            <s:form namespace="/" action="FspAssureProductCreat" theme="simple">
                <textarea style="width:500px;height:300px" name="piProduct">{"piProductH":{"assessmentYears":"20","elementMethod":"","eventDescription":"温度101","eventId":"1000185004","eventSDescription":"温度101","eventValidEnd":"2015-09-30 15:48:00","eventValidFrom":"2015-06-01 15:48:00","operationRunningDays":"=","pkiCode":"","productId":"t_001","productName":"温度01","returnVariable":"1","runningDays":"1","statisticMethod":"1"},"piProductI":[{"measureUnit":"C","meteroElement":"11","operationGrade":"","operationLb":">=","operationUb":"","phenomenaId":"","trigerPointLb":"35.0000","trigerPointUb":""}]}</textarea>
                </br>
                <input type="submit" value="模擬取得JSON"/>
            </s:form>
            </div>
        </div>
        <div>
            <h3>2. 模擬取得CSV</h3>
             <div class="ct">
            <a>前往</a>
             </div>
        </div>
        <div>
            <h3>3. Product查詢頁面</h3>
             <div class="ct">
            <a href="./Product/showProductInfo.action">前往</a>
             </div>
        </div>
        
    </body>
</html>
