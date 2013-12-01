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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <s:form method="post" action="cardVerify" >
              <h1>Please Enter your Credit Card Details </h1>
               <s:textfield name="cardNum" label="CardNumber" /><br>
               <s:textfield name="cvcNum" label="CVCNumber" /><br>
               <s:select  list="{'Visa','MasterCard','Discover','American Express'}" name="CardType" label="Card Type"/><br>
               <s:submit value="Validate" />
                 </s:form>
    </body>
    </body>
</html>
