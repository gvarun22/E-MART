<%-- 
    Document   : verifyCard
    Created on : Oct 29, 2013, 6:07:04 PM
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
           <form action="cardVerify">
               <h3><label for="name">Total amount for the shopping is: </label>
               <label id="totalamount">${totalAmount}</label></h3><br/>
                 <label for="name">Please enter your Card Number</label><br/>
                 <input type="text" name="cardNum"/>
                 <input type="submit" value="Validate"/>
           </form>
    </body>
</html>
