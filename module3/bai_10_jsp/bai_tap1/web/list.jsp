<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/1/2021
  Time: 2:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Result</title>
</head>
<body>

<table border="1">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>age</th>
        <th>birthday</th>
        <th>address</th>
        <th>gender</th>
    </tr>
    <c:forEach var="customer" items="${listCustomer}">
        <tr>
            <td><c:out value="${customer.id}"></c:out></td>
            <td><c:out value="${customer.name}"></c:out></td>
            <td><c:out value="${customer.age}"></c:out></td>
            <td><c:out value="${customer.birthday}"></c:out></td>
            <td><c:out value="${customer.address}"></c:out></td>
            <td>
                <c:if test="${customer.gender==0}">male</c:if>
                <c:if test="${customer.gender==1}">female</c:if>
            </td>


        </tr>

    </c:forEach>
</table>
</body>
</html>
