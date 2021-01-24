<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/1/2021
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int numberOne = Integer.parseInt(request.getParameter("number1"));
    int numberTwo = Integer.parseInt(request.getParameter("number2"));
    int total = numberOne + numberTwo;
%>
<h2 style="color: blue"><%=total%></h2>

</body>
</html>