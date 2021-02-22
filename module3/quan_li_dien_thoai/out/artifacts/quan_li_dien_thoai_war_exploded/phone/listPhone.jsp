<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/1/2021
  Time: 7:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Phone</title>
</head>
<body>
<table border="1">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>price</th>
        <th>color</th>
        <th>edit</th>
        <th>delete</th>
    </tr>
    <c:forEach var="phone" items="${listPhone}">
        <tr>
            <td>${phone.id}</td>
            <td>${phone.name}</td>
            <td>${phone.price}</td>
            <td>${phone.color}</td>
            <td><a href="/phone?action=edit&id=${phone.id}">edit</a></td>
            <td><a href="/phone?action=delete&id=${phone.id}">delete</a></td>
        </tr>

    </c:forEach>
</table>

</body>
</html>
