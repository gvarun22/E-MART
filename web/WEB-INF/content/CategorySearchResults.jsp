<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
         <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <title>Results</title>
    </head>
    <body>
        <form >
            <div class="container">
                <table class="table table-striped">
                    <s:iterator value="newList">
                        <tr>
                            <td>
                                <s:url action="callSelectItemActionClass" var="urlTag" >
                                    <s:param name="productId">${productId}</s:param> 
                                </s:url>                       
                                <a href="<s:property value="#urlTag"/>"  style="">${productName}</a>                      
                            </td>
                        </tr>
                    </s:iterator>

                </table>
            </div>
        </form>
    </body> 
</html>