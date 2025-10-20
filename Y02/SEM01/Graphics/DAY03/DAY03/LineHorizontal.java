import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LineHorizontal extends JFrame implements MouseListener
{
	Graphics g;
	LineHorizontal()
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
		g.setColor(Color.blue);
		g.drawLine(e.getX(),e.getY(),e.getX()+50,e.getY());
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}

	public static void main(String[] args)
	{
		new LineHorizontal();
	}
}