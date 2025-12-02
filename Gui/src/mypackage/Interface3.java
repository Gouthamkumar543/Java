package mypackage;
import java.awt.*;
import java.awt.event.*;

class Interface3 extends Frame implements ActionListener{
	
	TextField tf;
	
	Interface3(){
		tf=new TextField();  
		tf.setBounds(60,50,170,20); 
		
		Button b = new Button("click me");  
		b.setBounds(100,120,80,30);
		
		b.addActionListener(this);
		
		add(b);
		add(tf);  
		
		setSize(300,300);  
		setLayout(null);  
		setVisible(true); 
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
				System.exit(0);
			}
		});
	}
	
	public void actionPerformed(ActionEvent g) {
		tf.setText("Button clicked");
	}

	public static void main(String[] args) {
		new Interface3();
	}
}
