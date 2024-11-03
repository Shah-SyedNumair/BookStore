<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thank you for ordering.</title>
</head>
<body>

<table border='1' cellpadding='5'>
<tr>
<th>Book ID</th>
<th>AUTHOR</th>
<th>TITLE</th>
<th>PRICE</th>
<th>QTY</th>
</tr>
 <c:forEach items="${sessionScope.cart.items}" var="item">
 	<tr>
 	<td>${item.id}</td>
 	<td>${item.author}</td>
 	<td>${item.title}</td>
 	<td>${item.price}</td>
 	<td>${item.orderedQty}</td>
 	</tr>
 </c:forEach>
<tr><td colspan='5'>Total Price: $ ${sessionScope.cart.totalPrice}</td></tr>
</table><br/>

<ul>
<li>Customer Name: ${param.cust_name}</li>
<li>Customer Phone Number: ${param.cust_phone_num}</li>
<li>Customer City: ${param.cust_city}</li>
</ul>

<a href='index.html'>Back to Select Menu</a>

</body>
</html>