<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30/1/2021
  Time: 8:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Phone</title>
</head>
<body>
<h><a href="/phone?action=add">add new phone</a></h>

    <table>
        <tr>
            <td>id</td>
            <td>name</td>
            <td>price</td>
            <td>color</td>
            <td>edit</td>
            <td>delete</td>

        </tr>
        <c:forEach items="${allPhone}" var="phone">
            <tr>
                <td>${phone.id}</td>
                <td>${phone.name}</td>
                <td>${phone.price}</td>
                <td>${phone.color}</td>
                <td><a href="phone?action=edit&id=${phone.id}">edit</a></td>
                <td><a href="phone?action=delete&id=${phone.id}">delete</a></td>
            </tr>



        </c:forEach>


    </table>




</body>
</html>
