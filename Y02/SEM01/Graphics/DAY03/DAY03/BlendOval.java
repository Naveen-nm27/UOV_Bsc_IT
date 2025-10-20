import java.awt.*;
import javax.swing.*;
class BlendOval extends JFrame
{
	BlendOval()
	{
		setTitle("BlendOval");
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		
		int t1=10;
		for(int i=0;i<40;i++)
		{
			g.drawOval(100,100,t1,t1); //(x, y, width, height)
			t1=t1+5;
		}
		
		g.setColor(Color.blue);
		int t2=10;
		for(int i=0;i<40;i++)
		{
			g.drawOval(100,100,t2,t2);
			t2=t2+10;
		}
		
	}
	public static void main(String[] args)
	{
		new BlendOval();
	}
}