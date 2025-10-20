import java.awt.*;
import javax.swing.*;
class BlendOval2 extends JFrame
{
	BlendOval2()
	{
		setTitle("BlendOval2");
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		int x=0;
		for(int i=0;i<60;i++)
		{
			g.drawOval(100+x,300,50,50);//(x, y, width, height)
			x=x+5;
		}
		
		g.setColor(Color.blue);
		int y=0;
		for(int i=0;i<60;i++)
		{
			g.drawOval(250,150+y,50,50);//(x, y, width, height)
			y=y+5;
		}
	}
	public static void main(String[] args)
	{
		new BlendOval2();
	}
}