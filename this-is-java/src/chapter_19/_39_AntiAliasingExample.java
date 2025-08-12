package chapter_19;

import javax.swing.*;
import java.awt.*;

public class _39_AntiAliasingExample extends JFrame {
    public _39_AntiAliasingExample(){
        setTitle("AntiAliasing Example");
        setSize(200,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(new MyCanvas(),BorderLayout.CENTER);
    }

    public class MyCanvas extends Canvas{
        @Override
        public void paint(Graphics g){
            //No Anti
            g.fillOval(50,50,100,100);

            //Anti
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.fillOval(50,200,100,100);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _39_AntiAliasingExample JFrame = new _39_AntiAliasingExample();
                JFrame.setVisible(true);
            }
        });
    }
}