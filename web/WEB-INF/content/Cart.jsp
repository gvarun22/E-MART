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
    <div class="container">
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <title>Shopping Cart</title>
    </head>
    <body>
        <h1>Shopping Cart:</h1>


        <table cellspacing="0" class="table table-bordered">
            <thead><tr><th>Item Name</th><th>Quantity</th><th>Update</th></tr></thead>
                        <s:iterator value="items_map.keySet()" var='item'>


                <tr>
                    <td>${items_map.get(item).productName}</td>

                    <td><input type="text" maxlength="4" size="3" name="qty" value="${item_qty_map.get(item)}" /></td>
                    <td><input type="button" value="Update"/></td>



                </tr>

            </s:iterator>
        </table>
</div>
</body>
</html>
