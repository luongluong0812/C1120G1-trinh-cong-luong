<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/1/2021
  Time: 12:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h><a href="/student?action=add1">add new student</a></h>
<table border="1">
    <tr>
        <th>id</th>
        <th>age</th>
        <th>name</th>
        <th>address</th>
        <th>edit</th>
        <th>delete</th>
    </tr>
    <c:forEach var="student" items="${listStudent}">
<tr>
    <td> <c:out value="${student.id}"/></td>
    <td> <c:out value="${student.age}"/></td>
    <td> <c:out value="${student.name}"/></td>
    <td> <c:out value="${student.address}"/></td>
    <td> <a href="/student?action=edit&id=${student.id}">edit</a></td>
    <td> <a href="/student?action=delete&id=${student.id}">delete</a></td>
</tr>
    </c:forEach>

</table>

</body>
</html>
