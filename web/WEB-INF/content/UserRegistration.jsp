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
        <div class="container">
            <h1 style=" color: red">Please enter the Details </h1>
            (Fields marked with * are mandatory)
            <s:actionerror/>
            <form  method="post" class="form-horizontal" action="RegisterAction" >
                <div class="form-group">
                    <label for="un" class="col-sm-2 control-label">User Name(*)</label>
                    <input name="username" label="User Name(*)" class="form-control-2" />
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Password(*)</label>
                    <input type="password"  name="password" label="Password(*)" class="form-control-2"/>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">FirstName(*)</label>
                    <input name="FirstName" label="FirstName(*)" class="form-control-2"/>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">LastName(*)</label>
                    <input name="LastName" label="LastName(*)" class="form-control-2" />
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Address</label>
                    <input name="Address" label="Address" class="form-control-2"/>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Gender</label>
                    <input name="Gender"  label="Gender" class="form-control-2"/>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Day Phone</label>
                    <input name="dayPhone"  label="Day Phone" class="form-control-2"/>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Evening Phone</label>
                    <input name="eveningPhone"  label="Evening Phone"  class="form-control-2"/>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Email Id</label>
                    <input name="email"  label="Email Id" class="form-control-2" />
                </div>
                <button class="btn btn-default" value="Register">Register</button>
            </form>
        </div>
    </body>
</html>
