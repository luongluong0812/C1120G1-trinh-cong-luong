<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/1/2021
  Time: 7:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form delete</title>
</head>
<body>
<form>
    <h>do you want delete this phone?</h>
    <table>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>color</th>
        </tr>

            <c:forEach var="phone" items="phoneDelete">
         <tr>
             <td>${phone.name}</td>
             <td>${phone.price}</td>
             <td>${phone.color}</td>
         </tr>
            </c:forEach>

    </table>
</form>

</body>
</html>
