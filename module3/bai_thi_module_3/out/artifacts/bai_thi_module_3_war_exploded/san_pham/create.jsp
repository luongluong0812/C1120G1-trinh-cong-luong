<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/2/2021
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>create form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
<form method="post"  class="container">
    <table>
        <tr>
            <td> id: <input name="id" type="number"><br></td>
        </tr>
        <tr>
            <td>  name:<input name="name" type="text"><br></td>
        </tr>
        <tr>
            <td> gia:<input name="price" type="number"><br></td>
        </tr>
        <tr>
            <td>  muc giam gia:<input name="muc_giam_gia" type="number"><br></td>
        </tr>
        <tr>
            <td>  ton kho:<input name="ton_kho" type="number"></td>
        </tr>

    </table>

        <td> <button class="btn btn-outline-success">subit</button></td>







</form>
</body>
</html>
