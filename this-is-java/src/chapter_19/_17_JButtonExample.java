package chapter_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _17_JButtonExample extends JFrame{
    private JButton btn1, btn2, btn3;

    _17_JButtonExample(){
        setTitle("JButton Example");
        setSize(300,100);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        getContentPane().add(getBtn1());
        getContentPane().add(getBtn2());
        getContentPane().add(getBtn3());
    }

    private JButton getBtn1(){
        if (btn1 == null){
            btn1 = new JButton();
            btn1.setText("New1");
            btn1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFileChooser file = new JFileChooser();
                    file.showOpenDialog(_17_JButtonExample.this);
                }
            });
        }
        return btn1;
    }
    private JButton getBtn2(){
        if (btn2 == null){
            btn2 = new JButton();
            btn2.setText("New2");
            btn2.setBackground(Color.WHITE);
            btn2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFileChooser file = new JFileChooser("C://");
                    file.showOpenDialog(_17_JButtonExample.this);
                }
            });
        }
        return btn2;
    }
    private JButton getBtn3(){
        if (btn3 == null){
            btn3 = new JButton();
            btn3.setText("New3");
            btn3.setBackground(Color.WHITE);
            btn3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFileChooser file = new JFileChooser();
                    file.showOpenDialog(_17_JButtonExample.this);
                }
            });
        }
        return btn3;
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _17_JButtonExample JButton = new _17_JButtonExample();
                JButton.setVisible(true);
            }
        });
    }
}
