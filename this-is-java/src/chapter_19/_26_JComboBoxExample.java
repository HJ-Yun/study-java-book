package chapter_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class _26_JComboBoxExample extends JFrame {
    private JComboBox boxString, boxImage;
    private JPanel panel;
    private JLabel label;

    public _26_JComboBoxExample(){
        getContentPane().add(getPanel(), BorderLayout.NORTH);
        getContentPane().add(getLabel(), BorderLayout.CENTER);

        setTitle("JComboBox Example");
        setSize(250,200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JPanel getPanel(){
        if (panel == null){
            panel = new JPanel();
            panel.add(getBoxString());
            panel.add(getBoxImage());
        }
        return panel;
    }
    private JComboBox getBoxString(){
        if (boxString == null){
            String[] items = {"Cantaloupe", "Grapefruit", "Grapes", "Kiwi", "Peach",
                    "pineapple", "strawberry", "tomato", "watermelon"};
            boxString = new JComboBox(items);
            boxString.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int index = boxString.getSelectedIndex();
                    ImageIcon image = new ImageIcon(
                            getClass().getResource("source/fruit" + (index+1) + ".jpg")
                    );
                    getLabel().setIcon(image);
                }
            });
        }
        return boxString;
    }
    private JComboBox getBoxImage(){
        if (boxImage == null){
            Vector images = new Vector();
            for (int i = 1; i < 10; i++){
                ImageIcon image = new ImageIcon(
                        getClass().getResource("source/fruit" + i + ".jpg")
                );
                images.addElement(image);
            }
            boxImage = new JComboBox(images);
            boxImage.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ImageIcon image = (ImageIcon) boxImage.getSelectedItem();
                    getLabel().setIcon(image);
                }
            });
        }
        return boxImage;
    }

    private JLabel getLabel(){
        if (label == null){
            label = new JLabel();
            label.setHorizontalAlignment(JLabel.CENTER);
        }
        return label;
    }

    public static void main(String[] args) {
        _26_JComboBoxExample JFrame = new _26_JComboBoxExample();
        JFrame.setVisible(true);
    }
}
