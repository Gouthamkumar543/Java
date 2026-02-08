package ejb;

import java.sql.*;

public class ReservationBean {
    public boolean canReserve(String name, String startDate, String endDate) {
        boolean flag = true;
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hotel", "root", "goutham543");

            pst = conn.prepareStatement("SELECT * FROM reservation WHERE start_Date=?");
            pst.setDate(1, Date.valueOf(startDate));
            rs = pst.executeQuery();
            if (rs.next()) {
                flag = false;
            } else {
                PreparedStatement pstStore = conn.prepareStatement(
                    "INSERT INTO reservation(name, start_Date, end_Date) VALUES(?,?,?)");
                pstStore.setString(1, name);
                pstStore.setDate(2, Date.valueOf(startDate));
                pstStore.setDate(3, Date.valueOf(endDate));
                pstStore.executeUpdate();
                flag = true;
                pstStore.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            flag = false;
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return flag;
    }
}