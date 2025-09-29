import javax.swing.*;
import java.awt.*;

class Assingment3 extends JFrame{
	Assingment3(){
		setTitle("Ovel");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public void paint(Graphics g){
		g.setColor(Color.red);
 		for(int i = 50, a = 0;i < 100;i++){
			
			g.drawOval(50 + a,150,50,50);
			a = a + 4;
	}
		g.setColor(Color.blue);
	for(int i = 50 ,a = 0; i < 100; i++){
		g.drawOval(150,35 + a,50,50);
		a = a + 4;
	}
}
}

class Canvas3{
	public static void main(String[] args){
		new Assingment3();
	}
}