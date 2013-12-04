<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>  
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <title>Results</title>
    </head>
    <body>
        <div class="container">
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

            <div align="center" style="margin-left: 400px">
                <div class="col-md-4">
                    <display:table name="newList" pagesize="5"  sort="list" requestURI="/Search" class="table table-striped">

                        <display:column property="productName" title="Product Name" 
                                        sortable="true" headerClass="sortable" 
                                        href="callSelectItemActionClass" paramId="productId"
                                        paramProperty="productId" class="col-md-2 col-md-offset-5" />

                    </display:table>  
                </div>
            </div>
        </div>
        </div>
    </body> 
</html>