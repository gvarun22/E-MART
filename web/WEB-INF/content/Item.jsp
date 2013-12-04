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
    <head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
        <link rel="stylesheet" type="text/css" href="css/global.css"/>
    </head>

    <body>
        <s:actionerror/>
        <!--<form action="purchase" method="post"> -->
    <header class="navbar navbar-inverse navbar-fixed-top bs-docs-nav" role="banner">
        <div class="navbar-header">
            <ul class="nav navbar-nav navbar-right">
<<<<<<< HEAD
                        <li>
                            <a href="/E-MART/Home" class="navbar-brand"> Home</a>
                        </li>
=======
>>>>>>> e4fa3548cc977f507e4c23c8c4186df7555d880b
                <li>
                    <a href="/E-MART/Logout" class="navbar-brand"> Logout</a>
                </li>
            </ul>
        </div>
    </header>
    <br/>
    <br/>
    <br/>
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
                   
                    <div class="panel panel-default add-to-cart">
                        <div class="panel-heading">Add to cart</div>
                        <form action="AddToCart" method="POST">
                            <div class="panel-body">
                                <div class="row">
                                    <div class="col-md-3 col-md-offset-3">Cost:</div>
                                    <div class="col-md-3">$ ${Cost}</div>
                                </div>
                                <div class="row">
                                    <div class="col-md-3 col-md-offset-3">Quantity:</div>
                                    <div class="col-md-3"><input type="text" value="1" class="form-control-2 qty" name="quantity"/></div>
                                </div>
                                <div class="row">
                                    <div class="col-md-12"><input type="submit" value="Add" class="btn btn-success add-tocart-btn"/></div>
<<<<<<< HEAD
                                        <s:submit  value="addToCart"/>
                                    <div class="col-md-12"><input type="submit" value="Add" class="btn btn-success add-tocart-btn"/></div>
=======
                                    
>>>>>>> e4fa3548cc977f507e4c23c8c4186df7555d880b
                                </div>
                            </div>
                        </form>
                    </div>
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
<<<<<<< HEAD
=======

>>>>>>> e4fa3548cc977f507e4c23c8c4186df7555d880b
<div></div>
<!--</form>-->
</body>
</html>
