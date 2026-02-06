package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "inventory")
@SessionScoped
public class Inventory {

    private String item;
    private int price;
    private int quantity;

    // Getters and setters
    public String getItem() { return item; }
    public void setItem(String item) { this.item = item; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    // Action method
    public String addItem() {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/itemsdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                "root",
                "potham54"); // your MySQL password

            // Match your table exactly
            ps = con.prepareStatement("INSERT INTO inventory (Item, Price, Quantity) VALUES (?, ?, ?)");
            ps.setString(1, item);
            ps.setInt(2, price);
            ps.setInt(3, quantity);

            ps.executeUpdate();
            return "page1"; // success navigation
        } catch (Exception e) {
            e.printStackTrace();
            return "page2"; // failure navigation
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}