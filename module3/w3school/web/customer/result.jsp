<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/2/2021
  Time: 4:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>result</title>
</head>
<body>
<a href="/customer">back home</a>
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
    <c:forEach var="result" items="${result}">
        <tr>
            <td>${result.customerId}</td>
            <td>${result.customerName}</td>
            <td>${result.contactName}</td>
            <td>${result.address}</td>
            <td>${result.city}</td>
            <td>${result.postalCode}</td>
            <td>${result.country}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
