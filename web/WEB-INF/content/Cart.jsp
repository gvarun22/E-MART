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
        <link rel="stylesheet" type="text/css" href="css/global.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <title>Shopping Cart</title>
    </head>
    <body>
          <header class="navbar navbar-inverse navbar-fixed-top bs-docs-nav" role="banner">
                <div class="navbar-header">
                    <ul class="nav navbar-nav navbar-right">
                         <li>
                            <a href="/E-MART/Home" class="navbar-brand"> Home</a>
                        </li>
                        <li>
                            <a href="/E-MART/Logout" class="navbar-brand"> Logout</a>
                        </li>
                    </ul>
                </div>
            </header>
        <br/>
        <br/>
        <br/>
        <h1>Shopping Cart:</h1>


        <table cellspacing="0" class="cart-items">
            <thead><tr><th>Item Name</th><th>Quantity</th><th>Price</th><th>Update</th></tr></thead>
        </table>            
        <s:iterator value="items_map.keySet()" var='item'>

            <div class="row-div">

                <div class="col1 coldiv">
                    ${items_map.get(item).productName}
                </div>


                <form action="UpdateCart">
                    <div class="col2 coldiv">
                        <input type="text" maxlength="4" size="3" name="qty" value="${item_qty_map.get(item)}" />
                        <input type="hidden" name="prod_id" value="${item}"/>
                    </div>
                    <div class="col3 coldiv">
                        ${shoppingCart.ch.getProductPrice(items_map.get(item))}

                    </div>

                    <div class="col3 coldiv">
                        <input type="submit" value="Update Quantity"/>
                    </div>
                </form>


            </div>

        </s:iterator>
        <div class="checkout">

            <s:url action="purchase" var="urlTag" >

            </s:url>
            <s:a href="%{urlTag}">Checkout</s:a>
        </div>


    </body>
</html>
