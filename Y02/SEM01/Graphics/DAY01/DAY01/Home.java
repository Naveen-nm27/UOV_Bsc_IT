import javax.swing.*;
import java.awt.*;

class Home extends JFrmae{
	Home(){
		setTitle("Home");
		setSize("1140,800");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void pain(Graphics g){
		g.setColor(Color.red);
		g.drawLine(30,50,50,250);
				
		g.setColor(Color.red);
		g.drawLine(30,50,50,250);
		
		g.setColor(Color.Yellow);
		g.drawRect(30,50,50,250);
		
		g.setColor(Color.cyan);
		g.drawRect(30,50,50,250);
		
		g.setColor(Color.Line);
		g.drawRect(30,50,50,250);
		
		g.setColor(Color.Lime);
		g.drawRect(30,50,50,250);
		
	}
}

class Home{
	public static void main(string args[]){
		new Home();
	}
}
