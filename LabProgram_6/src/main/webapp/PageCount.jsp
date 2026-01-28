<!-- c.	Create a JSP page to print number of times page is referred after the page is loaded. -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simple JSP Page</title>
</head>
<body>
<%
    Integer hitsCount = (Integer) application.getAttribute("hitCounter");
    if (hitsCount == null) {
        hitsCount = 1;
        out.println("<h3>Welcome to my website!</h3>");
    } else {
        hitsCount += 1;
        out.println("<h3>Welcome back to my website!</h3>");
    }
    application.setAttribute("hitCounter", hitsCount);
%>
<p>Total number of visits: <%= hitsCount %></p>
</body>
</html>