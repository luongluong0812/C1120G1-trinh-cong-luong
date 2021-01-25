<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/1/2021
  Time: 4:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1> Simple Calculator</h1>
  <form action="/calculator">
    <div style="text-align: center">
      <h>Calculator</h>
      <h>number 1?</h> <input type="number" name="number1"><br>
      <select name="operator">
        <option>+</option>
        <option>-</option>
        <option>*</option>
        <option>/</option>
      </select> <br>
      <h>number 2?</h> <input type="number" name="number2"><br>
      <button type="submit">ok!</button>


    </div>
  </form>
  </body>
</html>
