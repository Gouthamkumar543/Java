package mypackage;

import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class MyServer extends HttpServlet {
    String message, Reg_no;
    Connection connect;
    Statement stmt = null;
    ResultSet rs = null;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/studentdb";
            connect = DriverManager.getConnection(url, "root", "goutham543");
            message = "Mark List";
        } catch (ClassNotFoundException cnfex) {
            cnfex.printStackTrace();
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        } catch (Exception excp) {
            excp.printStackTrace();
        }

        Reg_no = request.getParameter("regno");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Mark List</title></head>");
        out.println("<body >");
        out.println("<center>");
        out.println("<h1>" + message + "</h1>");

        try {
            stmt = connect.createStatement();
            String query = "SELECT * FROM MarkList WHERE regno=" + Reg_no;
            rs = stmt.executeQuery(query);

            if (rs.next()) {
                out.println("Registration No: " + rs.getInt(1));
                out.println("<br>Name: " + rs.getString(2));
                out.println("<table border='5'>");
                out.println("<tr><th>cs01</th><th>cs02</th><th>cs03</th><th>Status</th></tr>");

                do {
                    out.println("<tr>");
                    out.print("<td>" + rs.getString(3) + "</td>");
                    out.print("<td>" + rs.getString(4) + "</td>");
                    out.print("<td>" + rs.getString(5) + "</td>");
                    out.print("<td>" + rs.getString(6) + "</td>");
                    out.println("</tr>");
                } while (rs.next());

                out.println("</table>");
            } else {
                out.println("<p>No record found for Registration No: " + Reg_no + "</p>");
            }
        } catch (SQLException ex) {
            out.println("Error in connection");
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (connect != null) connect.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        out.println("</center>");
        out.println("</body></html>");
    }
}