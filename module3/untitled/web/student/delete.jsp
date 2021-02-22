<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/1/2021
  Time: 3:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>xoa student</title>
</head>
<body>
<h>ban muon xoa phai khong?</h>


    <h> <a name="yes" href="/student?action=yes&id=${student.id}">yes</a> <a name="no " href="/student">no</a> </h>

<table>
    <tr>
        <th>id</th>
        <th>age</th>
        <th>name</th>
        <th>address</th>
    </tr>
    <tr>
        <td>${student.id}</td>
        <td>${student.age}</td>
        <td>${student.name}</td>
        <td>${student.address}</td>

    </tr>


</table>


</body>
</html>
