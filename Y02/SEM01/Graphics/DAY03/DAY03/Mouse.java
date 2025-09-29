import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Mouse extends JFrame implements MouseListener{
	Graphics g;
	
	Mouse(){
		setSize(500,500);
		setTitle("Ovel");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		setLocationRelativeTo(null);
		setVisible(true);
		g=getGraphics();
	}
	
	public void mouseClicked(MouseEvent e){
		// g.setColor(Color.cyan);
		// g.fillOval(e.getX(),e.getY(),25,25);
		
		// g.setColor(Color.black);
		// g.drawLine(e.getX(),e.getY() ,20 ,e.getY());
		
		g.setColor(Color.black);
		g.drawLine(e.getX(),e.getY() ,e.getX(),20);

	}
	
	public void mouseEntered(MouseEvent e){
		
	}
	
	public void mouseExited(MouseEvent e){
		
	}
	
	public void mousePressed(MouseEvent e){

	}
	
	public void mouseReleased(MouseEvent e){
		
	}
}

class MouseDemo{
	public static void main(String[] args){
		new Mouse();
	}
}