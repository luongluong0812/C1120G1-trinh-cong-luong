<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/1/2021
  Time: 7:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
    <c:forEach var="product" items="${listProduct}">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.color}</td>
            <td><a href="/product?action=edit&id=${product.id}">edit</a></td>
            <td><a href="/product?action=delete&id=${product.id}">delete</a></td>

        </tr>


    </c:forEach>
    <tr><a href="/product?action=add">add new product</a></tr>
</table>
</body>
</html>
