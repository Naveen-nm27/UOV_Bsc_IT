import java.awt.*;
import javax.swing.*;
class Oval extends JFrame
{
	Oval()
	{
		setTitle("Oval");
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		
		for(int i=0;i<=100;i=i+5){
		g.setColor(Color.red);
		g.drawOval(100+i,200,50,50);
		}
		for(int i=0;i<=100;i=i+5){
		g.setColor(Color.green);
		g.drawOval(150,100+i,50,50);
		}
		/*
		g.setColor(Color.black);
		g.fillOval(200,200,200,200);
		g.setColor(Color.white);
		g.fillOval(220,220,160,160);
		*/
		
	}
	public static void main(String[] args)
	{
		new Oval();
	}
}