<!-- 7. Write a simple JSP application to demonstrate the use of implicit object (at least 5). -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Implicit Objects</title>
</head>
<body>
    <h2>JSP Implicit Objects Example</h2>
    <hr>

    <%-- Using response object --%>
    <%
        PrintWriter pw = response.getWriter();
        pw.println("Response writer example.");
    %>

    <br><br>
    <strong>Request (Locale): </strong> <%= request.getLocale() %> <br><br>

    <strong>Out object prints: </strong> <% out.print("HELLO MSC"); %> <br><br>

    <strong>Config (Servlet Name): </strong> <%= config.getServletName() %> <br><br>

    <strong>Application (Server Info): </strong> <%= application.getServerInfo() %> <br><br>

    <strong>Page (Class Name): </strong> <%= page.getClass().getName() %> <br><br>

    <strong>Session (Creation Time): </strong> <%= session.getCreationTime() %> <br><br>

    <% pageContext.setAttribute("Test", "Test Value"); %>
    <strong>PageContext (Class Name): </strong> <%= pageContext.getClass().getName() %> <br><br>

</body>
</html>