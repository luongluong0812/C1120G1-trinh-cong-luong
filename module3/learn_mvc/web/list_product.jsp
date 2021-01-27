<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26/1/2021
  Time: 6:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">

    <a href="/show_product_list"></a>
    <table border="1">
        <tr>
            <th>id</th>
            <th>name</th>
            <th>price</th>
            <th>color</th>
            <th>delete</th>
            <th>update</th>
        </tr>
<c:forEach items='${requestScope["product"]}' var="product">
    <tr>
        <td> <p>${product.name}</p> </td>
        <td> <p>${product.id}</p></td>
        <td> <p>${product.price}</p></td>
        <td> <p>${product.color}</p></td>
        <td> <p>${product.name}</p></td>
        <td> <p>${product.name}</p></td>
    </tr>
</c:forEach>
    </table>
</form>

</body>
</html>
