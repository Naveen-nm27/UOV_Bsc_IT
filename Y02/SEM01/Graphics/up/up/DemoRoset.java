import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyCanvas extends JFrame implements MouseListener {
    Graphics graphics;
    int radius = 50;       // radius of each circle
    int mainRadius = 100;  // distance from center to outer circles

    MyCanvas() {
        setTitle("8-Petal Circle Rosette");
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
        int xc = e.getX();
        int yc = e.getY();

        // Draw central circle
        drawCircle(xc, yc, radius);

        // Draw 8 surrounding circles
        for (int i = 0; i < 8; i++) {
            double angle = Math.toRadians(i * 45); // 360 / 8 = 45°
            int x = xc + (int) (mainRadius * Math.cos(angle));
            int y = yc + (int) (mainRadius * Math.sin(angle));
            drawCircle(x, y, radius);
        }
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
