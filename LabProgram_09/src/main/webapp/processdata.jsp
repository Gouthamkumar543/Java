<%@ page language="java" import="java.sql.*" %>
<html>
<head>
    <title>Process User Data</title>
</head>
<body>
<%
    String name    = request.getParameter("uname");
    String email   = request.getParameter("uemail");
    String pass    = request.getParameter("upass");
    String dob     = request.getParameter("udob");
    String gender  = request.getParameter("ugender");
    String phone   = request.getParameter("uphone");
    String country = request.getParameter("uloc");

    Connection con = null;
    PreparedStatement ps = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/applicationdb?useSSL=false&serverTimezone=UTC",
                "root",
                "goutham543");

        ps = con.prepareStatement("INSERT INTO registration (UNAME, UMAIL, UPASS, UDOB, UGENDER, UPHONE, UCOUNTRY) VALUES (?,?,?,?,?,?,?)");
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, pass);
        ps.setString(4, dob);
        ps.setString(5, gender);
        ps.setString(6, phone);
        ps.setString(7, country);

        int rows = ps.executeUpdate();
        if (rows > 0) {
            out.println("<h3 style='color:green;'>Data saved successfully!</h3>");
        } else {
            out.println("<h3 style='color:red;'>Failed to save data.</h3>");
        }
    } catch (Exception e) {
        out.println("<h3 style='color:red;'>Error: " + e.getMessage() + "</h3>");
    } finally {
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            out.println("<h3 style='color:red;'>Cleanup error: " + ex.getMessage() + "</h3>");
        }
    }
%>
</body>
</html>