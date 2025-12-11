import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Frame extends JFrame implements MouseListener{
	Graphics g;
	int x1,y1,x2,y2;
	boolean draw = false;
	
	Frame(){
		setTitle("Frame");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		g = getGraphics();
		addMouseListener(this);
	}
	
	public void paint(Graphics g){
		super.paint(g);

		if(draw){
			DDA(g,x1,y1,x2,y2);
		}
	}
	
	public void DDA(Graphics g,int x1,int y1,int x2,int y2){
		double steps,x,y;
		int dx,dy;
		
		dx = x2 - x1;
		dy = y2 - y1;
		
		steps = Math.max(Math.abs(dx),Math.abs(dy));
		
		double xi = dx / steps;
		double yi = dy / steps;
		
		x = x1;
		y = y1;
		
		for(int i = 0;i < steps;i++){
			g.drawLine((int)Math.round(x),(int)Math.round(y),(int)Math.round(x),(int)Math.round(y));
			x += xi;
			y += yi;
		}
	}
	
	public void mouseClicked(MouseEvent e){}
	public void mousePressed(MouseEvent e){
		x1 = e.getX();
		y1 = e.getY();
	}
	public void mouseReleased(MouseEvent e){
		x2 = e.getX();
		y2 = e.getY();
		draw = true;
		repaint();
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	
	public static void main(String[] args){
		new Frame();
	}
}