package Bresenham.Line;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BresenhamLine extends JFrame implements MouseListener {
    Graphics g;
    int x1,y1,x2,y2;
    boolean draw = false;
    
    BresenhamLine(){
        setTitle("BresenhamLine");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        g = getGraphics();
        addMouseListener(this);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLUE);
        g.drawString(String.valueOf(x1) + "," + String.valueOf(y1),x1,y1);
        g.drawString(String.valueOf(x2) + "," + String.valueOf(y2),x2,y2);

        if(draw){
            BresenhamDraw(g,x1, y1, x2, y2);
        }
    }
    public void BresenhamDraw(Graphics g,int x1,int y1,int x2,int y2){
        int dx = x2 - x1;
        int dy = y2 - y1;

        int pk = 2 * dy - dx;

        int x,y;
        x = x1;
        y = y1;

        while(x < x2){
            if(pk < 0){
                x = x + 1;
                pk = pk + (2 * dy);
                g.drawLine(x,y,x,y);
            } else {
                x = x + 1;
                y = y + 1;
                pk = pk + (2 * dy) - (2 * dx);
                g.drawLine(x,y,x,y);
            }
        }
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
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}

    public static void main(String[] args) {
        new BresenhamLine();
    }
}
