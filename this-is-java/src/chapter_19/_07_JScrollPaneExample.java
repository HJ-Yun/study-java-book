package chapter_19;

import javax.swing.*;
import java.awt.*;

public class _07_JScrollPaneExample extends JFrame{
    private JScrollPane scrollImage;
    private JLabel jLabel;

    public _07_JScrollPaneExample(){
        setTitle("JScrollPane Example");
        setSize(350,230);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(getScrollImage(),BorderLayout.CENTER);
    }

    private JScrollPane getScrollImage(){
        if (scrollImage == null){
            scrollImage = new JScrollPane(getLabelImage());
        }
        return scrollImage;
    }

    private JLabel getLabelImage(){
        if (jLabel == null){
            jLabel = new JLabel();
            jLabel.setIcon(new ImageIcon(getClass().getResource("source/picture.jpg")));
        }
        return jLabel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _07_JScrollPaneExample jScrollPane = new _07_JScrollPaneExample();
                jScrollPane.setVisible(true);
            }
        });
    }
}
