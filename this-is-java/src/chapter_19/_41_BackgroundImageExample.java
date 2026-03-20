package chapter_19;

import javax.swing.*;
import java.awt.*;

public class _41_BackgroundImageExample extends JFrame {
    private JTextField txtId;
    private JButton btn;

    public _41_BackgroundImageExample(){
        setTitle("BackgroundImage Example");
        setSize(200,270);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(new MyPanel(), BorderLayout.CENTER);
    }

    public class MyPanel extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            ImageIcon background = new ImageIcon(this.getClass().getResource("source/picture.jpg"));
            ImageIcon image1 = new ImageIcon(this.getClass().getResource("source/fruit1.jpg"));
            ImageIcon image2 = new ImageIcon(this.getClass().getResource("source/fruit2.jpg"));
            g.drawImage(background.getImage(),0,0,this);
            g.drawImage(image1.getImage(), 10,10,this);
            g.drawImage(image2.getImage(), 50,60,this);
        }

        public MyPanel(){
            setLayout(null);
            add(getTxtId());
            add(getBtn());
        }
    }
    private JTextField getTxtId(){
        if (txtId == null){
            txtId = new JTextField();
            txtId.setBounds(50,50,100,30);
        }
        return txtId;
    }
    private JButton getBtn(){
        if (btn == null){
            btn = new JButton("Button");
            btn.setBounds(50,100,100,30);
        }
        return btn;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _41_BackgroundImageExample JFrame = new _41_BackgroundImageExample();
                JFrame.setVisible(true);
            }
        });
    }
}