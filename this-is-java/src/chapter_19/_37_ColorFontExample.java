package chapter_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseMotionListener;

public class _37_ColorFontExample extends JFrame {
    public _37_ColorFontExample(){
        setTitle("ColorFront Example");
        setSize(500,400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(new MyCanvas(), BorderLayout.CENTER);
    }

    public class MyCanvas extends Canvas{
        @Override
        public void paint(Graphics g){
            g.setColor(Color.PINK);
            g.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,30));
            g.drawString("Color and Font",20,100);
        }
    }

// "Available Font Check"
//    public static void main(String[] args) {
//        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//        String[] fontNames = ge.getAvailableFontFamilyNames();
//        for(String fontName : fontNames) {
//            System.out.println(fontName);
//        }
//    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _37_ColorFontExample JFrame = new _37_ColorFontExample();
                JFrame.setVisible(true);
            }
        });
    }
}
