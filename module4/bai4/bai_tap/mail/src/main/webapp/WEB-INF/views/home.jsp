<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 31/3/2021
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<h>settings</h>
<form:form method="post" action="update" modelAttribute="send">
    <label>languages:</label>
    <form:select path="languages">
        <form:options items="${languages}"></form:options>
    </form:select>
    <label>page size: show</label>
    <form:select path="pageSize">
        <form:options items="${pageSize}"></form:options>
        <p>email per page</p>
    </form:select>
    <label>spam filter: </label>
    <form:checkbox path="spamFilter"></form:checkbox>
    <label>signature: </label>
    <form:input path="signature"></form:input>

    <button type="submit">update</button>

</form:form>

</body>
</html>
