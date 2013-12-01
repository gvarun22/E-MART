<%-- 
    Document   : Cart
    Created on : Dec 1, 2013, 2:09:32 PM
    Author     : punker
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Shopping Cart:</h1>
        
        
    
        <s:iterator value="cart_items" var='item'>

            <table>
                <tr>
                    <td>${item.productName}</td>
                </tr>
            </table>
      

    </s:iterator>

</body>
</html>
