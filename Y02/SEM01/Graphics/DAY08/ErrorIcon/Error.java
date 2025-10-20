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
		int p = 3 - 2 * r;
		
		while(x <= y){
			plotPixels(xc,yc,x,y);
			
			if(p < 0){
				p = p + 4 * x + 6;
			}else {
				p = p + 4 * (x - y) + 10;
				y--;
			}
			x++;
		}
		
		
		
	}
	
	
	
		public void plotPixels(int xc, int yc,int x,int y){
			g.setColor(Color.RED);
			g.fillRect(xc + x,yc - y,5,5);
			g.fillRect(xc + y,yc - x,5,5);
			g.fillRect(xc + y,yc + x,5,5);
			g.fillRect(xc + x,yc + y,5,5);
			g.fillRect(xc - x,yc + y,5,5);
			g.fillRect(xc - y,yc + x,5,5);
			g.fillRect(xc - y,yc - x,5,5);
			g.fillRect(xc - x,yc - y,5,5);
			
		}
		
		public void DrawBresenhamLine(int x1,int y1,int x2,int y2){
		int x,y,dx,dy,p;
		
		dx = Math.abs(x2 - x1);
		dy = Math.abs(y2 - y1);
		
		p = (2 * dy) - dx;
		
		
		x = x1;
		y = y1;
		
		for(int i = y1;i < y2; i++){
			if(p<0){
				y++;
				x=x;
				p+=2*dx;
			}else {
				y=y+1;
				x=x+1;
				p+=2*dx-2*dy;
			}
			g.drawLine(x,y,x,y);
		}
		
	}

		public void mousePressed(MouseEvent e){
				drawCircle(e.getX(),e.getY(),50);
				g.setColor(Color.BLUE);
				DrawBresenhamLine(50,50,90,90);
								

			
		}
		public void mouseReleased(MouseEvent e){

			
		}
		public void mouseClicked(MouseEvent e){

		}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}
		
	}
	
class Demo{
	public static void main(String args[]){
		new MyCanvas();
	}
}