package mypackage;
import java.awt.*;
import java.awt.event.*;

public class Interface6 {

	public static void main(String[] args) {
		Frame f = new Frame();
		
		Button b = new Button("Click me");
		b.setBounds(50,100,80,30);
		
		f.add(b);
		
		f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true); 
	    
	    f.addWindowListener(new WindowAdapter() {
	    	public void windowClosing(WindowEvent e) {
	    		f.dispose();
	    		System.exit(0);
	    	}
	    });
	}

}
