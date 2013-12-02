<%-- 
    Document   : UserRegistration
    Created on : Nov 18, 2013, 1:25:14 AM
    Author     : Rahul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <title>User Registration Page</title>
    </head>
    <body>
        <h1 style=" color: red">Please enter the Details </h1>
        (Fields marked with * are mandatory)
         <s:actionerror/>
         <s:form method="post" action="RegisterAction">
            
            <s:textfield name="username" label="User Name(*)" />
            <s:password  name="password" label="Password(*)"/>
            <s:textfield name="FirstName" label="FirstName(*)" />
            <s:textfield name="LastName" label="LastName(*)" />
            <s:textfield name="Address" label="Address" />
            <s:textfield name="Gender"  label="Gender" />
            <s:textfield name="dayPhone"  label="Day Phone" />
            <s:textfield name="eveningPhone"  label="Evening Phone" />
            <s:textfield name="email"  label="Email Id" />

            <s:submit value="Register"/>
        </s:form>
    </body>
</html>
