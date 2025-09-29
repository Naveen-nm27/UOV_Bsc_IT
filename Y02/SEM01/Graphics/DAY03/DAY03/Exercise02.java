import javax.swing.*;
import java.awt.*;

class Assingment2 extends JFrame{
	Assingment2(){
		setTitle("Ovel");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g){
	for(int i = 0; i < 25; i++){
			int a = 5 * i;
			if(i % 2 == 0){
				g.setColor(Color.red);
				g.drawOval(50,50,a,a);
			} else {
				g.setColor(Color.blue);
				g.drawOval(50,50,a,a);
			}

		}
	
	for(int i = 25; i < 50; i++){
			int a = 5 * i;
			g.setColor(Color.blue);
			g.drawOval(50,50,a,a);
		}
	}
}
	
class Cancas2{
	public static void main(String[] args){
		new Assingment2();
	}
}