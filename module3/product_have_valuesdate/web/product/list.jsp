<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/2/2021
  Time: 2:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<a href="/product?action=add">add new</a>
<table border="1">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>color</th>

    </tr>
    <c:forEach var="allProduct" items="${allProduct}">
        <tr>
            <td>${allProduct.id}</td>
            <td>${allProduct.name}</td>
            <td>${allProduct.color}</td>
        </tr>

    </c:forEach>
</table>

</body>
</html>
