<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/2/2021
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>home</title>
  </head>
  <body>
  <form action="/select" method="get">
    <h>SANDWITCH CONDIMENTS</h> <br>
    <INPUT type="checkbox" name="vegetable" value="lettuce"> lettuce
    <INPUT type="checkbox" name="vegetable" value="tomato"> tomato
    <INPUT type="checkbox" name="vegetable" value="mustard"> mustard
    <INPUT type="checkbox" name="vegetable" value="sprouts"> sprouts <br>
    <button type="submit">save</button>
  </form>
  </body>
</html>
