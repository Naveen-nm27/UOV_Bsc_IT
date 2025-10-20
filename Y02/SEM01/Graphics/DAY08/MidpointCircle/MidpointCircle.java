import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyCanvas extends JFrame implements MouseListener {
	Graphics g;
	MyCanvas(){
		setSize(500,500);
		setLocationRelativeTo(null);
		setTitle("Mid Point Circle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		setVisible(true);
		g=getGraphics();
	}
	
	public void drawCircle(int xc,int yc,int r){
		int x = 0;
		int y = r;
		int p = 1 - r;
		
		while(x <= y){
			plotPixels(xc,yc,x,y);
			
			if(p < 0){
				p = p + 2 * x + 3;
			}else {
				p = p + 2 * (x - y) + 5;
				y--;
			}
			x++;
		}
		
	}
		public void plotPixels(int xc, int yc,int x,int y){
			g.setColor(Color.RED);
			g.fillRect(xc + x,yc - y,2,2);
			g.setColor(Color.BLUE);
			g.fillRect(xc + y,yc - x,2,2);
			g.setColor(Color.ORANGE);
			g.fillRect(xc + y,yc + x,2,2);
			g.setColor(Color.CYAN);
			g.fillRect(xc + x,yc + y,2,2);
			g.setColor(Color.GREEN);
			g.fillRect(xc - x,yc + y,2,2);
			g.setColor(Color.GRAY);
			g.fillRect(xc - y,yc + x,2,2);
			g.setColor(Color.PINK);
			g.fillRect(xc - y,yc - x,2,2);
			g.setColor(Color.MAGENTA);
			g.fillRect(xc - x,yc - y,2,2);
		}
		
		public void mousePressed(MouseEvent e){

			
		}
		public void mouseReleased(MouseEvent e){

			
		}
		public void mouseClicked(MouseEvent e){
			for(int i = 100;i >= 20;i-=10){
				drawCircle(e.getX(),e.getY(),i);
				
			}
		}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}
		
	}
	
class Demo{
	public static void main(String args[]){
		new MyCanvas();
	}
}