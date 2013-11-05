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
        <title>JSP Page</title>
        <s:head/>
        
    </head>
    <body>
        <h1>Please Login to continue!</h1>
        <s:actionerror/>
        <s:form method="post" action="login">
            <s:textfield name="username" label="User Name" />
            <s:password name="password" label="Password"/>
            <s:submit value="Login"/>
        </s:form>
        
    </body>
</html>
