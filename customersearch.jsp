<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="CustomerSearchServlet" method="get">
	<label>Customer Name :</label>
	<input type="text" name="name">
	<br>
	<br>
	<input type="submit" name="submit" value="Search">
	</form>
</body>
</html>