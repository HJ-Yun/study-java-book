package chapter_19;

import javax.swing.*;
import java.awt.*;

public class _35_CanvasPaintExample extends JFrame {
    public _35_CanvasPaintExample(){
        setTitle("CanvasPaint Example");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(new MyCanvas(), BorderLayout.CENTER);
    }

    public class MyCanvas extends Canvas{
        @Override
        public void paint(Graphics g){
            g.drawString("Control the window size",50,80);
            System.out.println("paint() Method activated");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _35_CanvasPaintExample JFrame = new _35_CanvasPaintExample();
                JFrame.setVisible(true);
            }
        });
    }
}
