<%-- 
    Document   : Item
    Created on : Oct 31, 2013, 7:22:50 PM
    Author     : Rahul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.emart.SelectItemAction" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
  
    <body>
        <s:actionerror/>
        <form action="purchase" method="post">
        <div style="width: 400px;float:left;">
            <table>
                <tr>
                   <td> <img src="${image}" alt="image" width="300" height="400"/></td>
                </tr>
            </table>
        </div>
        <div style="width: 800px;float:left;">
            <table >
                 <tr>
            <td style="font-size: 70px; width:450px ;height:300px; text-align: center">${productName}</td>
            <td style="font-size: 20px; width:450px ;height:300px; text-align: center">
                <table>
                    <tr>
                        <td><label id="costLable">Cost</label></td>      
                        <td>$ ${cost}<input type=hidden name="priceLabel" value="${cost}"/> </td>            
                    </tr>
                    <tr>
                        <td><label id="quantityLable">Quantity </label></td>
                       <td><input type="text" name="quantity"/></td>
                </tr>
                </table>
            </td>
            </tr>
            <tr>
                <td style="width:200px ;height:250px; text-align: center" >
                    <label style="font-size: 20px"><em>Product Description </em><br>${productDescr}</label><br>
                </td>
            </tr>
           
            </table>
   </table>
        </div>
                <h2> <input type="submit" value="Purchase"/></h2>
        <div></div>
        </form>
    </body>
</html>
