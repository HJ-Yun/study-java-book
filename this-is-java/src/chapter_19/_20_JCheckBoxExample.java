package chapter_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _20_JCheckBoxExample extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JCheckBox boxRed, boxBlue;

    public _20_JCheckBoxExample(){
        setTitle("JCheck Box Example");
        setSize(400,200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(getPanel(), BorderLayout.WEST);
        getContentPane().add(getLabel(), BorderLayout.CENTER);
    }

    private JLabel getLabel(){
        if (label == null){
            label = new JLabel();
            getLabel().setBackground(null);
            getLabel().setText("Choose the box");
        }
        return label;
    }

    private JPanel getPanel(){
        if (panel == null){
            panel = new JPanel();
            panel.add(getBoxRed());
            panel.add(getBoxBlue());
        }
        return panel;
    }

    private JCheckBox getBoxRed(){
        if (boxRed == null){
            boxRed = new JCheckBox();
            boxRed.setText("Red");
            boxRed.addActionListener(ac);
        }
        return boxRed;
    }
    private JCheckBox getBoxBlue(){
        if (boxBlue == null){
            boxBlue = new JCheckBox();
            boxBlue.setText("Blue");
            boxBlue.addActionListener(ac);
        }
        return boxBlue;
    }
    private ActionListener ac = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            getLabel().setOpaque(true);

            if (boxRed.isSelected() && boxBlue.isSelected()){
                getLabel().setBackground(Color.PINK);
                getLabel().setText("Pink");
            } else if (boxRed.isSelected()) {
                getLabel().setBackground(Color.RED);
                getLabel().setText("Red");
            } else if (boxBlue.isSelected()){
                getLabel().setBackground(Color.BLUE);
                getLabel().setText("Blue");
            } else {
                getLabel().setBackground(null);
                getLabel().setText("Choose the box");
            }
        }
    };

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _20_JCheckBoxExample JFrame = new _20_JCheckBoxExample();
                JFrame.setVisible(true);
            }
        });
    }
}
