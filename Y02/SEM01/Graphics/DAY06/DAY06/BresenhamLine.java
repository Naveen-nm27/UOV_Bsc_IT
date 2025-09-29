import javax.swing.*
import java.awt.event.*;
import java.awt.*;

class Bresenhamline extends JFrame implements MouseListener{
	Graphics g;
	int x1,y1,x2,y2;
	
	Bresenhamline(){
		setTitle("Bresenhamline");
			setSize(800,600);
			setlocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setMouseListener(this);
			setVisible(this);
			setLayout(null);
			setVisible(true)
			g=getGraphics();
	}
	
	public void DrawBresenhamLine(int x1,int y1,int x2,int y2){
		int x,y,dx,dy,p;
		
		dx = Math.abs(x2 - x1);
		dy = Math.abs(y2 - y1);
		
		p = (2 * dy) - dx;
		
		
		x = x1;
		y = y1;
		
		for(int i = 0;i<
		
	}
}