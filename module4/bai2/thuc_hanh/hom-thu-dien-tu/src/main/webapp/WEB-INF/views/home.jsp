<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/2/2021
  Time: 9:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<h1>setting</h1>
<form:form modelAttribute="email" action="/update" method="post">
    <label>Language: </label>
    <form:select path="languages" items="${languages}"/><br/>
    <br/>
    <br/>
    <label>
        Page size:
    </label>
    show <form:select path="pageSize" items="${pageSize}"/> emails per page
    <br/>
    <br/>
    <label>Spams filter: </label>
    <form:radiobutton path="spam" value="1" label="Enable spam filter"/>
    <br/>
    <br/>
    <label>Signature: </label>
    <form:textarea path="signature"/>
    <input type="submit">
</form:form>

</body>
</html>
