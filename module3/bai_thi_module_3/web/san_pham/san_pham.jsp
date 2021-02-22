<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/2/2021
  Time: 9:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>
<div>
    <h>danh sach san pham</h><br>
    <button class="btn btn-outline-primary"><a href="/san_pham?action=create">them moi</a></button>
</div>
<div>
    <h>danh sach top</h>
    <select>
    <option>3</option>
    <option>5</option>
    <option>10</option>
</select>
    <button class="btn btn-outline-success">xem</button>
</div>
<table border="1" class="container">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>gia</th>
        <th>muc giam gia</th>
        <th>ton kh</th>
    </tr>
  <c:forEach items="${danhSach}" var="danhSach">
      <tr>
          <td>${danhSach.idSanPham}</td>
          <td>${danhSach.tenSanPham}</td>
          <td>${danhSach.giaSanPham}</td>
          <td>${danhSach.mucGiamGia}</td>
          <td>${danhSach.tonKho}</td>
      </tr>
  </c:forEach>
</table>
</body>
</html>
