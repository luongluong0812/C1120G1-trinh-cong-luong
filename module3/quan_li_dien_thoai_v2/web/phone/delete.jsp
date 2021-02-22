<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30/1/2021
  Time: 8:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form delete</title>
</head>
<body>
<h>delete this</h>
<h><a href="/phone?action=yes&id=${phoneDelete.id}">yes</a></h>
<h><a href="/phone?action=no&id=${phoneDelete.id}">no</a></h>

<table>
    <tr>
        <td>id</td>
        <th>name</th>
        <th>price</th>
        <th>color</th>

    </tr>

    <tr>
        <td>${phoneDelete.id}</td>
        <td>${phoneDelete.name}</td>
        <td>${phoneDelete.price}</td>
        <td>${phoneDelete.color}</td>
    </tr>



</table>

</body>
</html>
