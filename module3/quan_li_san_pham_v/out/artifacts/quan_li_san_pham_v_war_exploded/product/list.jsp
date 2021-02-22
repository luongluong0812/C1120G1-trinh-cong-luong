<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 31/1/2021
  Time: 1:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list product</title>
</head>
<body>
<h><a href="/product?action=add">add new</a></h>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>price</th>
        <th>color</th>
        <th>edit</th>
        <th>delete</th>
    </tr>
    <c:forEach var="allProduct" items="${allProduct}">
        <tr>
            <td>${allProduct.id}</td>
            <td>${allProduct.name}</td>
            <td>${allProduct.price}</td>
            <td>${allProduct.color}</td>
            <td><a href="/product?action=edit&id=${allProduct.id}">edit</a></td>
            <td><a href="/product?action=delete&id=${allProduct.id}">delete</a></td>

        </tr>

    </c:forEach>
</table>

</body>
</html>
