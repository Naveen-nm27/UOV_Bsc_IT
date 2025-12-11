import javax.swing.*;
import java.awt.*;

class MultipleLineStroke extends JFrame{
	MultipleLineStroke(){
		setTitle("Line");
		setSize(800,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setStroke(new BasicStroke(5));
		g2.drawLine(10,10,600,600);
	}
	
	public static void main(String[] args){
		new MultipleLineStroke();
	}
}