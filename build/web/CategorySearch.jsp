<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Search Item</title>

</head>

<body>

<form method="post" action="/searchItem">

<table>

    
    <tr>
        <td>Item Name:</td>
        <td><input type="text" name="itemname" size="10" />
    </td>
    </tr>
    <tr>
        <td>
            Item Category:</td>
        <td><select name="categories">
    <option value="-1">-Select Category-</option>
    <option value="Movies">Movies</option>
    <option value="Pharmacy">Pharmacy</option>
    </select>
    </td>
    </tr>
    <tr>
        <td>
    <input type="submit" value="Search" />
        </td>
    </tr>

    </table>

</form>

</body>

</html>