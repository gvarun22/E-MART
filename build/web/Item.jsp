<%-- 
    Document   : Item
    Created on : Oct 31, 2013, 7:22:50 PM
    Author     : Rahul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
  
    <body>
        <div style="width: 400px;float:left;">
            <table >
                <tr>
                    <td style="width: 400px; height: 200px;"><img width="300" height="300"src="C:/Users/Rahul/Desktop/eMART/E-MART/images/Lighthouse.jpg" ></td>
                </tr>
            </table>
        </div>
        <div style="width: 800px;float:left;">
            <table >
                 <tr>
            <td style="font-size: 70px; width:450px ;height:300px; text-align: center">Product Name</td>
            <td style="font-size: 20px; width:450px ;height:300px; text-align: center">
                <table>
                    <tr>
                        <td><label id="costLable">Cost </label></td>
                         <td><label id="priceLabel">Price Placeholder</label></td>
                    </tr>
                    <tr>
                        <td><label id="quantityLable">Quantity </label></td>
                        <td> <textarea id="quantityValue"></textarea></td>
                </tr>
                  <tr>
                        <td><label id="Total">Total </label></td>
                        <td> <label id="totalValue">Total Placeholder</label></td>
                </tr>
                </table>
            </td>
            </tr>
            <tr>
                <td style="width:200px ;height:250px; text-align: center" >
                     <label style="font-size: 20px">Description <br>1. The product is very good to use</label><br>
                     <label style="font-size: 20px">2. Good Sound quality</label>
                </td>
            </tr>
           
            </table>
   </table>
        </div>
      
        <div></div>
    </body>
</html>
