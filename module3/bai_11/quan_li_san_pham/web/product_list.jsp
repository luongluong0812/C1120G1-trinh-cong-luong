<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26/1/2021
  Time: 3:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    <table border="1">
        <tr>
            <td>id</td>
            <td>name</td>
            <td>price</td>
            <td>color</td>
            <td>update</td>

        </tr>
        <c:forEach var="product" items="${productFromSevlet}">
            <tr>
                <td><c:out value="${product.id}"/></td>
                <td><c:out value="${product.name}"/></td>
                <td><c:out value="${product.price}"/></td>
                <td><c:out value="${product.color}"/></td>
                <td>
                    <a href="/productServlet?action=update&id=${product.id}">Update</a>
                </td>

            </tr>


        </c:forEach>

    </table>
</form>

</body>
</html>
