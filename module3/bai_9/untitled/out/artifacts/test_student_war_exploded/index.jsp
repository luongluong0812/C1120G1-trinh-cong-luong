<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/1/2021
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
  <head>
    <title>kq</title>
  </head>
  <body>
  <table border="1">
    <tr>
      <th>id</th>
      <th>ten</th>
      <th>dia chi</th>
      <th>tuoi</th>
      <th>gioi tinh</th>
    </tr>
    <c:forEach var="student" items="${listStudent}">

<tr>
  <td><c:out value="${student.id}"></c:out></td>
  <td><c:out value="${student.name}"></c:out></td>
  <td><c:out value="${student.address}"></c:out> </td>
  

  <td>
    <c:if test="${student.age<15}">   <span> thieu nhi</span>    </c:if>
    <c:if test="${student.age>15}">   <span> thanh nien</span>    </c:if>



  </td>
  <td> 
  <c:choose>
    <c:when test="${student.gender==0}"> male</c:when>
    <c:when test="${student.gender==1}"> female</c:when>
  </c:choose>


  
  </td>

</tr>
    </c:forEach>



  </table>

  </body>
</html>
