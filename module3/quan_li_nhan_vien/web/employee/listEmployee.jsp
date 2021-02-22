<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30/1/2021
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LIST EMPLOYEE</title>
</head>
<body>

    <table border="1">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>email</th>
        <th>address</th>
        <th>edit</th>
        <th>delete</th>
    </tr>
        <c:forEach var="employee" items="${allEmployee}">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.name}</td>
                <td>${employee.email}</td>
                <td>${employee.address}</td>
                <td><a href="employee?action=edit&&id=${employee.id}">edit</a></td>
                <td><a href="employee?action=delete&&id=${employee.id}">delete</a></td>


        </c:forEach>


    </table>



</body>
</html>
