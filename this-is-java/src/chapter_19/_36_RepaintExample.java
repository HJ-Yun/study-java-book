package chapter_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class _36_RepaintExample extends JFrame {
    public _36_RepaintExample(){
        setTitle("Repaint Example");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(new MyConvas(), BorderLayout.CENTER);
    }

    public class MyConvas extends Canvas implements MouseMotionListener {
        private int x;
        private int y;

        public MyConvas(){
            addMouseMotionListener(this);
        }
        @Override
        public void update(Graphics g){
            paint(g);
        }
        @Override
        public void paint(Graphics g){
            g.drawString("*",x,y);
        }
        @Override
        public void mouseDragged(MouseEvent e){
            x = e.getX();
            y = e.getY();

            repaint();
        }
        @Override
        public void mouseMoved(MouseEvent e){
            System.out.println("aaa");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _36_RepaintExample JFrame = new _36_RepaintExample();
                JFrame.setVisible(true);
            }
        });
    }
}
