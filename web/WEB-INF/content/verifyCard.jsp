<%-- 
    Document   : verifyCard
    Created on : Oct 29, 2013, 6:07:04 PM
    Author     : Varun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>

        <title>JSP Page</title>
    </head>
    <body>
        <div class="container" >
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
            <s:form method="post" action="cardVerify" >

                <h2>The total Cost of the is :
                    <s:label>$ ${totalAmount}</s:label></h2>


                <br/><h3>Please Enter the  Billing  Address</h3>  
                    <div class="form-group">
                        <input type="text" name="ba_Addr1" id="ba_Addr1" class="form-control-2  " placeholder="Address 1"/>
                    </div>
                    <div class="form-group">
                        <input type="text" name="ba_Addr2" id="ba_Addr2" class="form-control-2" placeholder="Address 2"/>
                    </div>
                    <div class="form-group">
                        <input type="text" name="ba_city" id="ba_city" class="form-control-2" placeholder="City"/>
                    </div>
                    <div class="form-group">
                        <input type="text" name="ba_state" id="ba_state" class="form-control-2" placeholder="State"/>
                    </div>
                    <div class="form-group">
                        <input type="text" name="ba_zip" id="ba_zip" class="form-control-2" placeholder="Zip"/>
                    </div>



                    <br/><h3>Please Enter the  Shipping  Address</h3>  
                    <div class="form-group">
                        <input type="text" name="sh_Addr1" id="sh_Addr1" class="form-control-2" value="${userManager.shippingAddress.addr1}"/>
                    </div>
                    <div class="form-group">
                        <input type="text" name="sh_Addr2" id="sh_Addr2" class="form-control-2" value="${userManager.shippingAddress.addr2}"/>
                    </div>
                    <div class="form-group">
                        <input type="text" name="sh_city" id="sh_city" class="form-control-2" value="${userManager.shippingAddress.city}"/>
                    </div>
                    <div class="form-group">
                        <input type="text" name="sh_state" id="sh_state" class="form-control-2" value="${userManager.shippingAddress.state}"/>
                    </div>
                    <div class="form-group">
                        <input type="text" name="sh_zip" id="sh_zip" class="form-control-2" value="${userManager.shippingAddress.zip}"/>
                    </div>


                    <br/><h3>Please Enter Credit Card Information</h3>

                       <div class="form-group">
                        <select name="CardType" class="form-control-2" >
                            <option value="none">Type</option>
                            <option value="Visa">Visa</option>
                            <option  value="MasterCard">MasterCard</option> 
                            <option  value="Discover">Discover</option> 
                            <option  value="American Express">American Express</option>
                        </select>
                    </div>
                    
                    <div class="form-group">
                        <input type="text" required="true" name="cardNum" id="cardNum" required="true" class="form-control-2" placeholder="CardNumber"/>
                    </div>

                    <div class="form-group">
                        <input type="text" required="true" name="cvcNum" id="cvcNum" required="true" class="form-control-2" placeholder="CVCNumber"/>
                    </div>

                 
                    <button type="submit"  name="Validate" id="Validate" class="col-md-offset-2 btn-warning" placeholder="Validate">
                        Confirm
                    </button>     


            </s:form>


    </body>
</div>
</body>
</html>
