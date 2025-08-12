package chapter_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _19_JRadioButtonExample extends JFrame {
    private JPanel panel;
    private JRadioButton btRed, btBlue;
    private JLabel label;

    public _19_JRadioButtonExample(){
        setTitle("JRadio Button Example");
        setSize(400,200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(getLabel(), BorderLayout.CENTER);
        getContentPane().add(getPanel(), BorderLayout.WEST);

        ButtonGroup btGroup = new ButtonGroup();
        btGroup.add(getBtRed());
        btGroup.add(getBtBlue());
    }

    private JLabel getLabel(){
        if (label == null){
            label = new JLabel();
            label.setText("Red");
            label.setOpaque(true);
            label.setBackground(Color.RED);
        }
        return label;
    }

    private JPanel getPanel(){
        if (panel == null){
            panel = new JPanel();
            panel.add(getBtRed());
            panel.add(getBtBlue());
        }
        return panel;
    }

    private JRadioButton getBtRed(){
        if (btRed == null){
            btRed = new JRadioButton();
            btRed.setText("Red");
            btRed.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getLabel().setText("Red");
                    getLabel().setOpaque(true);
                    getLabel().setBackground(Color.RED);
                }
            });
        }
        return btRed;
    }
    private JRadioButton getBtBlue(){
        if (btBlue == null){
            btBlue = new JRadioButton();
            btBlue.setText("Blue");
            btBlue.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getLabel().setText("Blue");
                    getLabel().setOpaque(true);
                    getLabel().setBackground(Color.BLUE);
                }
            });
        }
        return btBlue;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _19_JRadioButtonExample JFrame = new _19_JRadioButtonExample();
                JFrame.setVisible(true);
            }
        });
    }
}
