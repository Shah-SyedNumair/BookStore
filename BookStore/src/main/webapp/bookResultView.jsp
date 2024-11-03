<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Query Results</title>
</head>
<body>

<h2> Query Results</h2>
<form method="get" action="CartServlet">

<table border="1" cellpadding="6">
<tr>
<th>&nbsp;</th>
<th>Book ID</th>
<th>AUTHOR</th>
<th>TITLE</th>
<th>PRICE</th>
<th>QTY</th>
</tr>
<c:forEach items="${requestScope.bookList}" var="e">
	<tr>
	<td> <input type='checkbox' name='bookId' value="${e.id}" /> </td>
	<td>${e.id}</td>
	<td>${e.author}</td>
	<td>${e.title}</td>
	<td>${e.price}</td>
	<td><input type="text" size="5" value="1" name="qty${e.id}" /></td>
	</tr>
</c:forEach>
</table><br/>
<input type="hidden" name="todo" value="add">
<input type="submit" value="Add to my SHOPPING CART">
<input type="reset" value="CLEAR">

</form>
<a href="index.html">Back to Select Menu</a>

</body>
</html>