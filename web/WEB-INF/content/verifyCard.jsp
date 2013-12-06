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
            <table  >
                <tr><td style="width: 600; font-size: x-large;font-weight: bold; ">The total Cost of the is :</b></td>
                    <td ><s:label>${price}</s:label></td></tr>
                </table>
                <table>
                    <tr><td ><b>Please Enter the  Billing  Address  </b></td></tr>
                    <tr style="">
                        <td style="width: 600;"><s:textfield name="ba_Addr1" label="Address 1" /></td>
                </tr>
                <tr>
                    <td style="width: 600"><s:textfield name="ba_Addr2" label="Address 2" /></td>
                </tr>
                <tr>
                    <td style="width: 600"><s:textfield name="ba_city" label="City" /></td>
                </tr>
                <tr>
                    <td style="width: 600"><s:textfield name="ba_state" label="State" /></td>
                </tr>
                <tr>
                    <td style="width: 600"><s:textfield name="ba_zip" label="Zip" /></td> 
                </tr>


            </table>
            <table  >
                <tr><td style="width: 600"><b>Please Enter the Shipping Address  </b></td></tr>
                <tr>
                    <td style="width: 600"><s:textfield name="sh_Addr1" label="Address 1" /></td>
                </tr>
                <tr>
                    <td style="width: 600"><s:textfield name="sh_Addr2" label="Address 2" /></td>
                </tr>
                <tr>
                    <td style="width: 600"><s:textfield name="sh_city" label="City" /></td>
                </tr>
                <tr>
                    <td style="width: 600"><s:textfield name="sh_state" label="State" /></td>
                </tr>
                <tr>
                    <td style="width: 600"><s:textfield name="sh_zip" label="Zip" /></td> 
                </tr>

            </table>

            <table>
                <tr><td><b>Please Enter Credit Card Information</b></td></tr>
                <tr><td style="width: 600; "><s:textfield name="cardNum" label="CardNumber" /></td></tr>
                <tr><td style="width: 600"><s:textfield name="cvcNum" label="CVCNumber" /></td></tr>
                <tr><td style="width: 600"><s:select  list="{'Visa','MasterCard','Discover','American Express'}" name="CardType" label="Card Type"/></td></tr>
                <tr><td style="width: 600"><s:submit value="Validate" /></td></tr>

            </table>
        </s:form>


    </body>
</body>
</html>
