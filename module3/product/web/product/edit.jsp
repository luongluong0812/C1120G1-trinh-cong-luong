<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/1/2021
  Time: 7:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>edit</title>
</head>
<body>
<form method="post">
    <input hidden name=edit" value="action">
    <input hidden name="id" value="${product.id}" >
    <p>name:     <input name="name"  value="${product.name}"></p>
    <p>price:    <input name="price"  value="${product.price}"></p>
    <p>color:    <input name="color"  value="${product.color}"></p>

    <button>submit</button>
</form>



</body>
</html>
