import java.awt.*;
import javax.swing.*;
class GraphicElement extends JFrame{
	GraphicElement(){
		setTitle("Frame");
		setSize(800,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		g.setColor(Color.green);
		g.drawLine(30,50,30,250);
		
		g.setColor(Color.red);
		g.drawString("hi",200,150);
		
		g.setColor(Color.blue);
		g.drawRect(30,50,200,300);
		g.fillRect(30,50,200,300);
		
	}

}

class GraphicElements{
		public static void main(String arg[]){
		new GraphicElement();
		// System.out.println("Watsted !");
	}
}