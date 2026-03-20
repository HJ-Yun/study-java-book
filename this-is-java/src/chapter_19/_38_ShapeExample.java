package chapter_19;

import javax.swing.*;
import java.awt.*;

public class _38_ShapeExample extends JFrame {
    public _38_ShapeExample(){
        setTitle("Shape Example");
        setSize(400,300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(new MyCavas(), BorderLayout.CENTER);
    }

    public class MyCavas extends Canvas{
        @Override
        public void paint(Graphics g){
            //Circle
            g.drawOval(50,50,50,50);
            g.setColor(Color.GREEN);
            g.fillOval(50,100,50,50);

            //Line
            g.setColor(Color.RED);
            g.drawLine(50,100,100,50);
            g.drawLine(150,50,50,150);

            //Rectangle
            g.setColor(Color.BLUE);
            g.drawRoundRect(200,50,120,80,30,30);
            g.setColor(Color.YELLOW);
            g.fillRoundRect(250,100,120,80,30,30);

            //Polygon
            g.setColor(Color.ORANGE);
            g.fillPolygon(new int[]{50,100,150,200}, new int[]{250,200,200,250},4);

            //Arc
            g.setColor(Color.cyan);
            g.fillArc(250,200,100,100,45,120);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _38_ShapeExample JFrame = new _38_ShapeExample();
                JFrame.setVisible(true);
            }
        });
    }
}
