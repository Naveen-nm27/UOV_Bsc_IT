import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyCanvas extends JFrame implements MouseListener {
	Graphics graphics;
	
	MyCanvas() {
		setTitle("ica");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		addMouseListener(this);
		setVisible(true);
		graphics = getGraphics();
	}
	
	int x1, y1, x2, y2;
	public void bresenhamAlgo(int x1, int y1, int x2, int y2) {
		int dx = Math.abs(x2 - x1);
		int dy = Math.abs(y2 - y1);
		
		int sx = (x1 < x2) ? 1 : -1;
		int sy = (y1 < y2) ? 1 : -1;
		
		int err = dx - dy;
		
		while (true) {
			graphics.drawLine(x1, y1, x1, y1);
			
			if (x1 == x2 && y1 == y2) {break;}
			
			int e2 = 2 * err;
			
			if (e2 > -dy) {
				err -= dy;
				x1 += sx;
			}
			
			if (e2 < dx) {
				err += dx;
				y1 += sy;
			}
		}
	}
	
	
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
	}
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();
		
		bresenhamAlgo(x1, y1, x2, y2);
	}
}

class Demo {
	public static void main(String[] args) {
		new MyCanvas();
	}
}