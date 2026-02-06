<!-- b.	Create a JSP page to print current date and time -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Date and Time</title>
</head>
<body>
    <h3>Using Expression tag to display the result of the expression</h3>
    <p>The Current date and time = <%= new java.util.Date() %></p>
</body>
</html>