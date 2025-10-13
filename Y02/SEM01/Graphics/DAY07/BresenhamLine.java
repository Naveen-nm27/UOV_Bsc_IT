import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BresenhamLine extends JFrame implements MouseListener {
    Graphics g;
    int x1, y1, x2, y2;

    BresenhamLine() {
        setTitle("Bresenham Algorithm");
        setSize(800, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
        setLocationRelativeTo(null);
        setVisible(true);
        g = getGraphics();
    }

    public void bresenhamLineAlgo(int x1, int y1, int x2, int y2) 
	{ 
        //full fill the method
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
        bresenhamLineAlgo(x1, y1, x2, y2);
    }

    public static void main(String[] args) {
        new BresenhamLine();
    }
}
