<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/2/2021
  Time: 8:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>result</title>
</head>
<body>
<table border="1" class="container">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>price</th>
        <th>color</th>
    </tr>
    <c:forEach var="resultSearch" items="${resultSearch}">
        <tr>
            <td>${resultSearch.id}</td>
            <td>${resultSearch.name}</td>
            <td>${resultSearch.price}</td>
            <td>${resultSearch.color}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
