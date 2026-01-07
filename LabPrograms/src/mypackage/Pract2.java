//2.program to demonstrate typical Editable Table, describing employee details for a software company.

package mypackage;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Pract2 extends JFrame {
    JTable jtb;
    JScrollPane jsp;

    public Pract2() {
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        String colHeads[] = {"Sr.no", "Name", "Phone No"};
        Object data[][] = {
            {"1", "abc", "1242642"},
            {"2", "def", "572656"},
            {"3", "ghi", "5364535"},
            {"4", "jkl", "955345"},
            {"5", "mno", "231212"},
            {"6", "pqr", "758278"},
            {"7", "stu", "8532034"},
            {"8", "vwx", "587255"},
            {"9", "yza", "899534"},
            {"10", "bcd", "9259554"}
        };

        jtb = new JTable(data, colHeads);
        jsp = new JScrollPane(jtb);

        c.add(jsp, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Pract2 p2 = new Pract2();
        p2.setTitle("Employee Details");
        p2.setSize(400, 300);
        p2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p2.setVisible(true);
    }
}