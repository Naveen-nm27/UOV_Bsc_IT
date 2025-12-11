import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DDAAlgo extends JFrame implements MouseListener{
	Graphics g;
	int x1,y1,x2,y2;
	boolean draw = false;
	
	
	DDAAlgo(){
		setTitle("DDA");
		setSize(800,800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		addMouseListener(this);
		g = getGraphics();
	}
	
	public void paint(Graphics g){
		super.paint(g);

		g.setColor(Color.RED);
		
		if(draw){
			//DDA(g,x1,y1,x2,y2);
			starTrig();
		}

	}
	
	public void DDA(Graphics g,int x1,int y1,int x2,int y2){
		int dx,dy;
		double steps,xi,yi,x,y;
		
		dx = x2 - x1;
		dy = y2 - y1;
		
		steps = Math.max(Math.abs(dx),Math.abs(dy));
		
		xi = dx / steps;
		yi = dy / steps;
		
		x = x1;
		y = y1;

		
		for(int i = 0;i <= steps;i++){
			g.drawLine((int)Math.round(x),(int)Math.round(y),(int)Math.round(x),(int)Math.round(y));
			
			//try {
				//Thread.sleep(2); // slows down drawing
			//} catch (Exception ex) {}
					
			x+=xi;
			y+=yi;
		}
	}

    public void starTrig(){
	// Upper triangle
	DDA(g, 360, 100, 460, 400);  // right edge
	DDA(g, 360, 100, 260, 400);  // left edge
	DDA(g, 260, 400, 460, 400);  // base

	// Lower triangle (symmetric vertically)
	DDA(g, 360, 500, 460, 200);  // right edge
	DDA(g, 360, 500, 260, 200);  // left edge
	DDA(g, 260, 200, 460, 200);  // base
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
		// DDA(g,x1,y1,x2,y2);
		
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	
	public static void main(String[] args){
		new DDAAlgo();
	}
}