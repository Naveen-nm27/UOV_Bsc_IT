import javax.swing.*;
import java.awt.*;

class Canvas extends JFrame{
	Graphics g;
	Canvas(){
		setTitle("Test");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(5));
		g2.drawLine(0,0,150,200);
	}

	public static void main(String[] args){
		new Canvas();
	}
}