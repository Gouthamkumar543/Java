package mypackage;
import java.awt.*;
import java.awt.event.*;

public class Interface5 extends Frame{
	
	TextField tf;
	
	Interface5(){
		tf = new TextField();
		tf.setBounds(60,50,170,20);  
		
		Button b=new Button("click me");  
		b.setBounds(50,120,80,30);
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				tf.setText("Goutham");
			}
		});
		
		add(tf); add(b);
		
		setSize(300,300);  
		setLayout(null);  
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new Interface5();
	}

}
