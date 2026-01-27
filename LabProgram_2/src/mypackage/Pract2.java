//2.Create GUI to demonstrate typical Editable Table which describing Employee for a software company.

package mypackage;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Pract2 {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Editable Employee Table - Software Company");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.setLayout(new BorderLayout());

        // Column names
        String[] columnNames = {"Employee ID", "Name", "Role", "Department", "Salary"};

        // Sample employee data
        Object[][] data = {
                {"E101", "Alice Johnson", "Software Engineer", "Development", 75000},
                {"E102", "Bob Smith", "QA Analyst", "Testing", 60000},
                {"E103", "Charlie Brown", "Project Manager", "Management", 90000},
                {"E104", "Diana Prince", "UI/UX Designer", "Design", 65000},
                {"E105", "Ethan Hunt", "DevOps Engineer", "Operations", 80000}
        };

        // Table model (editable by default)
        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            public boolean isCellEditable(int row, int column) {
                // Make all cells editable
                return true;
            }
        };

        // JTable
        JTable table = new JTable(model);
        table.setFillsViewportHeight(true);

        // Add table to scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        // Add components to frame
        frame.add(scrollPane, BorderLayout.CENTER);

        // Add a button panel for demonstration
        JPanel buttonPanel = new JPanel();
        JButton addRowButton = new JButton("Add Employee");
        JButton removeRowButton = new JButton("Remove Selected");

        // Add new row
        addRowButton.addActionListener(e -> {
            model.addRow(new Object[]{"", "", "", "", ""});
        });

        // Remove selected row
        removeRowButton.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                model.removeRow(selectedRow);
            } else {
                JOptionPane.showMessageDialog(frame, "Please select a row to remove.");
            }
        });

        buttonPanel.add(addRowButton);
        buttonPanel.add(removeRowButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Show frame
        frame.setVisible(true);
    }
}