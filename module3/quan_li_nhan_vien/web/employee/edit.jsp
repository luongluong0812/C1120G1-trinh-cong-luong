<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30/1/2021
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <input hidden name=edit" value="action">
    <input hidden name="id" value="${employeeEdit.id}" >
    <p>name:    <input name="name"  value="${employeeEdit.name}"></p>
    <p>email:    <input name="email"  value="${employeeEdit.email}"></p>
    <p>address:    <input name="address"  value="${employeeEdit.address}"></p>
    <button><a href="/employee?action=update">submit</a></button>









<%--<form method="post">--%>
<%--    <input hidden name=edit" value="action">--%>
<%--    <input hidden name="id" value="${studentInfo.id}" >--%>
<%--    //bi an--%>

<%--    <p>age:    <input name="age"  value="${studentInfo.age}"></p>--%>
<%--    <p>name:    <input name="name"  value="${studentInfo.name}"></p>--%>
<%--    <p>address:    <input name="address"  value="${studentInfo.address}"></p>--%>

<%--    <button>submit</button>--%>
<%--</form>--%>

</body>
</html>
