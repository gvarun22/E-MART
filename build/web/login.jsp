<%-- 
    Document   : login
    Created on : Nov 4, 2013, 12:04:20 PM
    Author     : PLEX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <title>JSP Page</title>
     </head>
    <body>
        <div class="container">
        <h1>Please Login to continue!</h1>
        <s:actionerror/>

        <form method="post" action="login" role="form">
            <div class="form-group">
                <label for="username">User Name</label>
                <input name="username" id="username" label="User Name" class="form-control-2"   />
            </div>
            <div class="form-group">        
                <label for="password">password</label>
                <input type="password" name="password" id="password" label="Password"class="form-control-2" />
            </div>
            
            <button type="submit" value="Login" class="btn btn-default"     >Login</button> 
        </form>
        <form action="NavigateTORegister">
            <label>New User? Register here</label><br/>
            <button type="submit" value="Register" class="btn btn-default"  >Register</button> 
        </form>
        </div>
    </body>
</html>
