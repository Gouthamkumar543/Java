package mypackage;
import java.awt.*;

public class Interface2 {
	Interface2(){
		Frame f = new Frame();
		Button b = new Button("Click");
		b.setBounds(30,50,80,30);
		f.add(b);
		f.setSize(300,300);
		f.setVisible(true);
		f.setLayout(null);
	}
	public static void main(String[] args) {
		new Interface2();
	}
}
