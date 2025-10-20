import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Circle extends JFrame implements MouseListener
{
	Graphics g;
	Circle()
	{
		setSize(600,600);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		setLocationRelativeTo(null);
		setVisible(true);
		g=getGraphics();
	}
	
	public void mouseClicked(MouseEvent e)
	{
		//Invoked  when the mouse button has been clicked (pressed and released) on a component
		g.setColor(Color.blue);
		g.fillOval(e.getX(),e.getY(),30,30);//(x, y, width, height)
	}
	
	public void mouseEntered(MouseEvent e)
	{
		
		//Invoked  when the mouse enters to the area of a component
	}
	public void mouseExited(MouseEvent e)
	{
		
		//Invoked  when the mouse exit to the area of a component
	}
	public void mousePressed(MouseEvent e)
	{
		
		//Invoked  when a mouse button has been pressed on a component
	}
	public void mouseReleased(MouseEvent e)
	{
		//Invoked  when a mouse button has been released on a component
	}

	public static void main(String[] args)
	{
		new Circle();
	}
}