<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%
    String userid = request.getParameter("usr");
    String password = request.getParameter("password");

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/logindb?useSSL=false&serverTimezone=UTC",
                "root",
                "goutham543");

        ps = con.prepareStatement("SELECT * FROM users WHERE USERID=? AND PASSWORD=?");
        ps.setString(1, userid);
        ps.setString(2, password);

        rs = ps.executeQuery();

        if (rs.next()) {
            // SAME: store userid in session
            session.setAttribute("userid", userid);
            out.println("<h2>Welcome, " + userid + "! You are logged in.</h2>");
        } else {
            out.println("<h2 style='color:red;'>Invalid username or password. <a href='index.html'>Try again</a></h2>");
        }
    } catch (Exception e) {
        e.printStackTrace();
        out.println("<h2 style='color:red;'>Login error! Please <a href='index.html'>try again</a>.</h2>");
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
%>