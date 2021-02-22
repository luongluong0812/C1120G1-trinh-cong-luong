<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/2/2021
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>edit form</title>
</head>
<body>
<form method="post">
<%--    public Customer(int customerId, String customerName, String contactName, String address, String city, String postalCode, String country) {--%>

     <input type="hidden" name="customerId" value="${customerEdit.customerId}"> <br>
    customerName:<input name="customerName" value="${customerEdit.customerName}"><br>
    contactName:<input name="contactName" value="${customerEdit.contactName}"><br>
    address:<input name="address" value="${customerEdit.address}"><br>
    city:<input name="city" value="${customerEdit.city}"><br>
    postalCode:<input name="postalCode" value="${customerEdit.postalCode}"><br>
    country:<input name="country" value="${customerEdit.country}"><br>
    <button>submit</button>

</form>

</body>
</html>
