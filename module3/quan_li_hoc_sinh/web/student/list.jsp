<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/1/2021
  Time: 3:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>id</th>
        <th>age</th>
        <th>name</th>
        <th>email</th>
        <th>address</th>
        <th>edit</th>
        <th>delete</th>
    </tr>
    <c:forEach var="student" items="${list_student}">
        <tr>
            <td>${student.id}</td>
            <td>${student.age}</td>
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>${student.address}</td>
            <td><a href="/student/action=edit&id=${student.id}">edit</a></td>
            <td><a href="/student/action=delete&id=${student.id}">edit</a></td>
        </tr>

    </c:forEach>
</table>

</body>
</html>
