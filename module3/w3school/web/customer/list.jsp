<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/2/2021
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<form method="post">
    <input type="hidden" name="action" value="search">
    <input type="text" name="key" value="enter word!">
    <button>submit</button>
</form>
<table border="1">
<%--    public Customer(int customerId, String customerName, String contactName, String address, String city, String postalCode, String country) {--%>

    <tr>
        <th>customerId</th>
        <th>customerName</th>
        <th>contactName</th>
        <th>address</th>
        <th>city</th>
        <th>postalCode</th>
        <th>country</th>
        <th>edit</th>
        <th>delete</th>
    </tr>
    <c:forEach var="customerList" items="${customerList}">
        <tr>
            <td>${customerList.customerId}</td>
            <td>${customerList.customerName}</td>
            <td>${customerList.contactName}</td>
            <td>${customerList.address}</td>
            <td>${customerList.city}</td>
            <td>${customerList.postalCode}</td>
            <td>${customerList.country}</td>
            <td><a href="/customer?action=edit&id=${customerList.customerId}">edit</a></td>
            <td><a href="/customer?action=delete&id=${customerList.customerId}">delete</a></td>

        </tr>
    </c:forEach>
</table>

</body>
</html>
