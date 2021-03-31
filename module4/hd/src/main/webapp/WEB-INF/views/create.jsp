<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/2/2021
  Time: 5:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>create</title>
</head>
<body>
<form:form  method="post" action="/create-user" modelAttribute="user">
    user:<form:input type="text" path="userName"/><br>
    password:<form:input type="text" path="password"/><br>
    age:<form:input type="text" path="age"/>
    <button type="submit">create</button>
</form:form>
</body>
</html>
