//2.Create GUI to demonstrate typical Editable Table which describing Employee for a software company.

package mypackage;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Pract2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Goutham");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.setLayout(new BorderLayout());
        String[] columnNames = {"Employee ID", "Name", "Role", "Department", "Salary"};
        Object[][] data = {
                {"E101", "Goutham", "Software Engineer", "Development", 75000},
                {"E102", "Sravan", "QA Analyst", "Testing", 60000},
                {"E103", "Bhanu", "Project Manager", "Management", 90000},
                {"E104", "Vivek", "UI/UX Designer", "Design", 65000},
                {"E105", "Hari", "DevOps Engineer", "Operations", 80000}
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            public boolean isCellEditable(int row, int column) {
                return true;
            }
        };
        JTable table = new JTable(model);
        table.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        JButton addRowButton = new JButton("Add Employee");
        JButton removeRowButton = new JButton("Remove Selected");
        addRowButton.addActionListener(e -> {
            model.addRow(new Object[]{"", "", "", "", ""});
        });
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
        frame.setVisible(true);
    }
}