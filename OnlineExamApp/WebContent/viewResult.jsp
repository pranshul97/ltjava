<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Screen</title>
</head>
<body>
<%
	Integer result =(Integer) session.getAttribute("score");
	session.invalidate();
%>
<h1>Result= <%= result %> out of 4</h1>
<h3>Thank You for taking the test</h3>
<h4>See you Again</h4>
</body>
</html>