package Bresenham.Line;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Bresenham2 extends JFrame implements MouseListener {
    int x1,y1,x2,y2;
    Graphics g;
    boolean draw = false;

    Bresenham2(){
        setTitle("Bresenham2");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        g = getGraphics();
        addMouseListener(this);
    }

    public void paint(Graphics g){
        g.setColor(Color.blue);
        
        if(draw){
            bresenhamDraw(g, x1, y1, x2, y2);
        }
    }

    public void bresenhamDraw(Graphics g,int x1,int y1,int x2,int y2){
        int dx = x2 - x2;
        int dy = y2 - y1;

        int pk = 2 * dy - dx;
        int x = x1;
        int y = y1;


        while(x < x2){
            if(pk < 0){
                x = x1 + 1;
                y = y1;
                pk = pk + (2 * dy);
            } else {
                x = x1 + 1;
                y = y1 + 1;
                pk = pk + (2 * dy) - (2 * dx);
            }
        }
    }

    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){
        x1 = e.getX();
        y1 = e.getY();
        draw = true;
        repaint();
    }
    public void mouseReleased(MouseEvent e){
        x2 = e.getX();
        y2 = e.getY();
    }

    public static void main(String[] args){
        new Bresenham2();
    }

}
