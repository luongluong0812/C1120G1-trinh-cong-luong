<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/1/2021
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      .form{
        color: red;
      }
    </style>
  </head>
  <body>
  <form class="form" method="get" action="/calculator">


    <p>Product Description</p><input type="text" name="info"> <br>
    <p>List Price</p><input type="number" name="price"> <br>
    <p>Discount Percent:</p><input type="number" name="discount"><br>
    <button>ok</button>

  </form>
  </body>
</html>
