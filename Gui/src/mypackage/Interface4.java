package mypackage;
import java.awt.*;
import java.awt.event.*;

public class Interface4 extends Frame{
	
	TextField tf;
	
	Interface4(){
		tf = new TextField();
		tf.setBounds(60,50,170,20);
		
		Button b = new Button("Submit");
		b.setBounds(100,120,80,30);
		
		Outer o = new Outer(this);
		b.addActionListener(o);
		
		add(b); add(tf);
		
		setSize(300,300);  
		setLayout(null);  
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing( WindowEvent we) {
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new Interface4();
	}
}


class Outer implements ActionListener{
	Interface4 obj;
	
	Outer(Interface4 obj){
		this.obj = obj;
	}
	
	public void actionPerformed(ActionEvent e) {
		obj.tf.setText("Welcome to my Gui");
	}
}