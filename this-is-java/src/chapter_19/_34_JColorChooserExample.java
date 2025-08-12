package chapter_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _34_JColorChooserExample extends JFrame {
    private JButton jButton;

    public _34_JColorChooserExample(){
        setTitle("JColorChooser Example");
        setSize(150,60);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,1));

        getContentPane().add(getjButton());
    }

    private JButton getjButton(){
        if (jButton == null){
            jButton = new JButton("Color Chooser Button");
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Color color = JColorChooser.showDialog(_34_JColorChooserExample.this,
                            "Color Chooser Tittle",
                            null);
                    jButton.setBackground(color);
                }
            });
        }
        return jButton;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _34_JColorChooserExample JFrame = new _34_JColorChooserExample();
                JFrame.setVisible(true);
            }
        });
    }

}
