<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Temperature Conversion</title>
</head>
<body>
<%
    if ("POST".equalsIgnoreCase(request.getMethod())) {
        try {
            float celsius = Float.parseFloat(request.getParameter("celsius"));
            float fahrenheit = (9 * celsius / 5) + 32;
            out.print("<h3>Fahrenheit: " + fahrenheit + "</h3>");
        } catch (Exception e) {
            out.print("<h3 style='color:red;'>Invalid input. Please enter a number.</h3>");
        }
    }
%>
</body>
</html>