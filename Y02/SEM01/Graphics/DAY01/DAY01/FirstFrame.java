import javax.swing.*;

public class FirstFrame{
	public static void main(String[] args){
		JFrame frm = new JFrame();
		
		frm.setSize(400,300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLocation(new java.awt.Point(100,300));
		frm.setTitle("empt frame");
		frm.setVisible(true);
	}
}

