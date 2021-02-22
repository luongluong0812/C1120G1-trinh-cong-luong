<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/1/2021
  Time: 1:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <input hidden name=edit" value="action">
    <input hidden name="id" value="${studentInfo.id}" >
    //bi an
    <p>age:    <input name="age"  value="${studentInfo.age}"></p>
    <p>name:    <input name="name"  value="${studentInfo.name}"></p>
    <p>address:    <input name="address"  value="${studentInfo.address}"></p>

    <button>submit</button>
</form>

</body>
</html>
