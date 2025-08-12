package chapter_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class _04_JWindowExample extends JWindow {
    _04_JWindowExample(){
        this.setSize(800,600);

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        int leftTopX = centerPoint.x - this.getWidth()/2;
        int leftTopY = centerPoint.y - this.getHeight()/2;
        this.setLocation(leftTopX,leftTopY);

        JLabel jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon(getClass().getResource("source/picture.jpg")));
        getContentPane().add(jLabel, BorderLayout.CENTER);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _04_JWindowExample jWindow = new _04_JWindowExample();
                jWindow.setVisible(true);
            }
        });
    }
}
