<%-- 
    Document   : Success
    Created on : Oct 29, 2013, 6:16:12 PM
    Author     : Varun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="PlaceOrder" method="post">
        <h3>
            <table>
                <tr>
                    <td><label id="cartCost">Cart Cost :</label></td>      
                    <td>$ ${cartAmount}<input type=hidden name="cartAmount" value=${cartAmount}/> </td>            
            </tr>
            <tr>
                <td><label id="shippingCost">Shipping  Cost : </label></td>
                <td>$ ${sh_cost}<input type=hidden name="sh_cost" value=${sh_cost}/></td>
            </tr>
            <tr>
                <td><label id="totalCost"">Total Cost :</label></td>
                <td>$ ${totalAmount}<input type="hidden" name="finalCost" value=${totalAmount}></td>
            </tr>
        </table>
        </h3>
            <h5> <input type="submit" name="user_click" value="Place your order"/>
                <input type="submit" name="user_click" value="Cancel Order"/>
            </h5>
         </form>
    </body>
    </body>
</html>