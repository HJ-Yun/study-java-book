package chapter_19;

import javax.swing.*;
import java.awt.*;

public class _40_ImageExample extends JFrame {
    public _40_ImageExample(){
        setTitle("Image Example");
        setSize(500,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(new MyCanvas(),BorderLayout.CENTER);
    }

    public class MyCanvas extends Canvas{
        private Image img1, img2;

        public MyCanvas(){
            setBackground(Color.WHITE);

            Toolkit toolkit = Toolkit.getDefaultToolkit();
            img1 = toolkit.getImage(getClass().getResource("source/fruit1.jpg"));
            img2 = new ImageIcon(getClass().getResource("source/fruit2.jpg")).getImage();
        }

        @Override
        public void paint(Graphics g){
            g.drawImage(img1,10,10,this);
            g.drawImage(img2,300,20,this);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _40_ImageExample JFrame = new _40_ImageExample();
                JFrame.setVisible(true);
            }
        });
    }
}