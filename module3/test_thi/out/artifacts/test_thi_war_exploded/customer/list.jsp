<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/2/2021
  Time: 1:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<table border="1">
    <tr>
        <th>id</th>
        <th>age</th>
        <th>address</th>
        <th>name</th>
        <th>edit</th>
        <th>delete</th>
    </tr>
    <c:forEach var="allCustomer" items="${allCustomer}">
        <tr>
            <td>${allCustomer.id}</td>
            <td>${allCustomer.age}</td>
            <td>${allCustomer.address}</td>
            <td>${allCustomer.name}</td>
            <td><a href="/customer?action=edit&id=${allCustomer.id}"> edit</a></td>
            <td><a href="/customer?action=delete&id=${allCustomer.id}"> delete</a></td>

        </tr>
    </c:forEach>
</table>

</body>
</html>
