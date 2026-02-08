package ejb;

import java.sql.*;

public class StudentBean {
    public boolean registerStudent(String name, String course, String email) {
        boolean flag = false;
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegedb", "root", "goutham543");

            pst = conn.prepareStatement("INSERT INTO student(name, course, email) VALUES(?,?,?)");
            pst.setString(1, name);
            pst.setString(2, course);
            pst.setString(3, email);

            int i = pst.executeUpdate();
            if (i > 0) flag = true;
        } catch (Exception e) {
            e.printStackTrace(); // Check Tomcat logs for details
            flag = false;
        } finally {
            try {
                if (pst != null) pst.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return flag;
    }
}