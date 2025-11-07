import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyCanvas extends JFrame implements MouseListener {
    Graphics graphics;
    int radius = 50; // fixed radius

    MyCanvas() {
        setTitle("Bresenham Circle Click");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addMouseListener(this);
        setVisible(true);
        graphics = getGraphics();
    }

    // Bresenham Circle Algorithm
    void drawCircle(int xc, int yc, int r) {
        int x = 0, y = r;
        int d = 3 - 2 * r;

        while (x <= y) {
            putPixel(xc + x, yc + y);
            putPixel(xc - x, yc + y);
            putPixel(xc + x, yc - y);
            putPixel(xc - x, yc - y);
            putPixel(xc + y, yc + x);
            putPixel(xc - y, yc + x);
            putPixel(xc + y, yc - x);
            putPixel(xc - y, yc - x);

            if (d < 0)
                d = d + 4 * x + 6;
            else {
                d = d + 4 * (x - y) + 10;
                y--;
            }
            x++;
        }
    }

    void putPixel(int x, int y) {
        graphics.drawLine(x, y, x, y);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        drawCircle(e.getX(), e.getY(), radius);
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
	
}

class Demo {
	public static void main(String[] args) {
        new MyCanvas();
    }
}
