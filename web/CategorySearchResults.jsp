<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title>Results</title>
    </head>
    <body>
        <div>
            <table style="border-style: solid">
                
            <s:iterator value="newList">
                <tr>
                    <td>
                <a href="http://google.com/#q=${productName}" style="">${productName}</a>
                   </td>
                </tr>
               <!-- <a href="https://www.google.com/#q="><s:property value="pname" /></a>-->
            </s:iterator>
                 
            </table>
        </div>
    </body> 
</html>