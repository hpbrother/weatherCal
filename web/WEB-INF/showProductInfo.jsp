<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Product查詢頁面</h2>
        <table>
            <tr>
                <th>project_code</th>
                <th>product_id</th>
                <th>cst_product_id</th>
                <th>product_status</th>
                <th>cst_prodcut_dec</th>
                <th></th>
            </tr>
            <s:iterator value="listProductMaster">
            <tr>
                <td><s:property value="id.productCode"/></td>
                <td><s:property value="id.productId"/></td>
                <td><s:property value="cstProductId"/></td>
                <td><s:property value="productStatus"/></td>
                <td><s:property value="cstProductDec"/></td>
                <td>
                    <s:url id="url" action="ajaxSetProductOnOff" namespace="/Product" escapeAmp="false">
                        <s:param name="productId" value="id.productId"></s:param>
                        <s:param name="status">1</s:param>
                    </s:url>
                    <a href="<s:property value="#url"/>">setStatusTo1</a>
                </td>
            </tr>    
            </s:iterator>
        
        </table>
        
    </body>
</html>
