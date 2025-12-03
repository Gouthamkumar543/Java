package mypackage;
import java.awt.*;
import java.awt.event.*;

public class Interface8 {

	public static void main(String[] args) {
		Frame f = new Frame();
		
		Label l1,l2;
		
		l1 = new Label("First label");
		l1.setBounds(50,100, 100,30);
		
		l2 = new Label("Second label");
		l2.setBounds(50,150, 100,30);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
				System.exit(0);
			}
		});
		
		f.add(l1); f.add(l2);
		
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

}
