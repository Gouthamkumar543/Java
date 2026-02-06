<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>

<%
    // Get form parameters
    String fname = request.getParameter("fname");
    String lname = request.getParameter("lname");
    String email = request.getParameter("email");
    String userid = request.getParameter("userid");
    String password = request.getParameter("password");

    Connection conn = null;
    PreparedStatement ps = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(
        	    "jdbc:mysql://localhost:3306/logindb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
        	    "root",
        	    "goutham543");
        ps = conn.prepareStatement(
            "INSERT INTO users (FNAME, LNAME, UMAIL, USERID, PASSWORD) VALUES (?, ?, ?, ?, ?)"
        );
        ps.setString(1, fname);
        ps.setString(2, lname);
        ps.setString(3, email);
        ps.setString(4, userid);
        ps.setString(5, password);

        int i = ps.executeUpdate();
        if (i > 0) {
            out.println("<h3>Thank you for registering! Please <a href='index.html'>Login</a> to continue.</h3>");
        } else {
            out.println("<h3 style='color:red;'>Registration failed. Please try again.</h3>");
        }
    } catch (Exception e) {
        e.printStackTrace();
        out.println("<h3 style='color:red;'>Error: " + e.getMessage() + "</h3>");
    } finally {
        try {
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
%>