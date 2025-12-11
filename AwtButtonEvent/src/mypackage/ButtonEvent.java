package mypackage;
import java.awt.*;
import java.awt.event.*;

public class ButtonEvent {

	public static void main(String[] args) {
		Frame f = new Frame();
		
		final TextField t = new TextField();
		t.setBounds(50,50, 150,20);
		
		Button b = new Button("Click me");
		b.setBounds(50,100,60,30);
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				t.setText("Goutham Kumar");
			}
		});
		
		f.add(b); f.add(t);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
