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
        super.paint(g);
        g.setColor(Color.BLUE);
        

        if(draw){
            bresenhamDraw(g, x1, y1, x2, y2);
            g.drawLine(400, 0, 400, 800);
            g.drawLine(0, 400, 800, 400);
            g.drawLine(0, 0, 800, 800);
            g.drawLine(0, 800, 800, 0);



        }
    }

    public void bresenhamDraw(Graphics g,int x1,int y1,int x2,int y2){
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int pk = 2 * dy - dx;
        int x = x1;
        int y = y1;


        while(x <= x2){
            if(pk < 0){
                pk = pk + (2 * dy);
            } else {
                y++;
                pk = pk + (2 * dy) - (2 * dx);
            }
            x++;
            g.drawLine(x,y,x,y);
        }
    }

    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
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

    public static void main(String[] args){
        new Bresenham2();
    }

}
