<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/2/2021
  Time: 3:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>delete</title>
</head>
<body>
<h>delete??</h>
<a href="/customer?action=yes&id=${customerDelete.customerId}">yes</a>
<a href="/customer?action=no&id=${customerDelete.customerId}">no</a>
<table>
    <tr>
        <th>customerId</th>
        <th>customerName</th>
        <th>contactName</th>
        <th>address</th>
        <th>city</th>
        <th>postalCode</th>
        <th>country</th>

    </tr>
        <tr>
            <td>${customerDelete.customerId}</td>
            <td>${customerDelete.customerName}</td>
            <td>${customerDelete.contactName}</td>
            <td>${customerDelete.address}</td>
            <td>${customerDelete.city}</td>
            <td>${customerDelete.postalCode}</td>
            <td>${customerDelete.country}</td>
        </tr>
</table>

</body>
</html>
