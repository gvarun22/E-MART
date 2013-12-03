<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="Facebook.SimpleTest" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <title>E-MART</title>
    </head>
    <body>
        <br/>
        <br/>
        <br/>
        <div class="container">
            <header class="navbar navbar-inverse navbar-fixed-top bs-docs-nav" role="banner">
                <div class="navbar-header">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="/E-MART/Logout" class="navbar-brand"> Logout</a>
                        </li>
                    </ul>
                </div>
            </header>


            <div class="container">
                <div class="row">
                    <div>
                        <h1>Welcome to E-MART ${userManager.cust.firstName}</h1>
                        <form method="post" action="Search" class="form-inline">
                            <div class="form-group">
                                <label for="name" class="sr-only">Name of Product</label>
                                <input type="text" name="name" id="name" class="form-control" placeholder="Product name"/>
                            </div>
                            <div class="form-group">
                                <select name="prodCategory" class="form-control" >
                                    <option value="none">Select Category</option>
                                    <option value="Electronics">Electronics</option>
                                    <option  value="Books">Books</option> 
                                    <option  value="Movies">Movies</option> 
                                    <option  value="Food">Food</option>
                                    <option value="Apparel">Apparel</option> 
                                    <option  value="Games">Games</option> 
                                    <option value="Pharmacy">Pharmacy</option> 
                                </select>
                            </div>
                            <input type="submit" value="Search" class="btn btn-default"/>
                        </form>
                        <div>
                            <h1>Recommended products</h1>
                            <big>
                                <div align="center">
                                    <table class="table table-bordered">
                                        <tr>
                                            <s:iterator value="products" var='item'>

                                                <td>
                                                    <s:url action="callSelectItemActionClass" var="urlTag" >
                                                        <s:param name="productId">${item.productId}</s:param> 
                                                    </s:url>                       
                                                    <a href="<s:property value="#urlTag"/>"  style="">
                                                        <img src="${item.productPic}" width="200" height="200"/><br/>
                                                        <b>${item.productName}</b><br />
                                                        <b>$ ${item.productPrice}</b>
                                                    </a>                      
                                                </td>

                                            </s:iterator>
                                        </tr>
                                    </table>
                                </div>
                            </big>
                        </div>
                        <h1>Facebook Recommendations</h1>
                        <big>
                            <div align="center">
                                <table class="table table-bordered">
                                    <tr>
                                        <h1>             
                                        <td>${facebookReco}</td>
                                        </h1>
                                    </tr>
                                </table>
                                
                            </div>
                        </big>
                    </div>
                </div>
            </div>
    </body>
</html>