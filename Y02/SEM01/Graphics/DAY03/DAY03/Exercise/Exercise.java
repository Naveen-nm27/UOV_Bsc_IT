import javax.swing.*;
import java.awt.*;

class Assingment extends JFrame{
	Assingment(){
		setTitle("Ovel");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		
		g.setColor(new Color(181, 93, 240));
		g.fillRect(0,0,getWidth(),getHeight());
		
		g.setColor(Color.black);
		g.fillOval(100,100,180,180);
		// g.drawRect(100,100,180,180);
		
		g.setColor(Color.white);
		g.fillOval(145,145,90,90);
		// g.drawRect(145,145,90,90);
		
		for(int i = 0; i < 50; i++){
			
		}
		
	}
	
}

class PrintDemo{
	public static void main(String[] args){
		new Assingment();
	}
}