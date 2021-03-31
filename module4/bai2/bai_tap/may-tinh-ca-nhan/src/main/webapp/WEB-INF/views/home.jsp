<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/2/2021
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<form action="/calculate">
    so thu nhat:<input type="number" name="number1">
    so thu hai:<input type="number" name="number2"> <br>
    <button name="cal" type="submit" value="cong">+</button>
    <button name="cal" type="submit" value="tru">-</button>
    <button name="cal" type="submit" value="nhan">*</button>
    <button name="cal" type="submit" value="chia">/</button>
</form>
<h>${result}</h>
</body>
</html>
