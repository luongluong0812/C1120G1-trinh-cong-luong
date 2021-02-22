<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/1/2021
  Time: 9:22 PM
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
        <th>name</th>
        <th>age</th>
        <th>address</th>
        <th>delete</th>
        <th>edit</th>
    </tr>
    <c:forEach items="${studentInfo}" var="student">
<tr>
    <td><c:out value="${student.id}"/></td>
    <td><c:out value="${student.name}"/></td>
    <td><c:out value="${student.age}"/></td>
    <td><c:out value="${student.address}"/></td>
    <td><a href="/student?action=delete&id=${student.id}">Edit</a></td>
    <td>  <a href="/student?action=edit&id=${student.id}">Delete</a></td>

</tr>
    </c:forEach>
</table>

</body>
</html>
