<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 31/1/2021
  Time: 9:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form edit</title>
</head>
<body>
<form method="post">
    <input hidden name="action" value="edit">
    <input hidden name="id" value="${phoneEdit.id}">
    <input name="name" value="${phoneEdit.name}">
    <input name="price" value="${phoneEdit.price}">
    <input name="color" value="${phoneEdit.color}">
<button>submit</button>
</form>

</body>
</html>
