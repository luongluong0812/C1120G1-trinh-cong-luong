<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 31/1/2021
  Time: 1:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>edit</title>
</head>
<body>
<form method="post" >
    <input type="hidden" name="action" value="edit">
    <input type="hidden" name="idEdit" value="${productEdit.id}">
    <input type="text" name="nameEdit" value="${productEdit.name}">
    <input type="number" name="priceEdit" value="${productEdit.price}">
    <input type="text" name="colorEdit" value="${productEdit.color}">
    <button>submit</button>
</form>

</body>
</html>
