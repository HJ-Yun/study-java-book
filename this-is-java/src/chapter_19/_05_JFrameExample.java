package chapter_19;

import javax.swing.*;
import java.awt.*;

public class _05_JFrameExample extends JFrame {
    _05_JFrameExample(){
        this.setSize(600,500);

        this.setIconImage(new ImageIcon(getClass().getResource("source/picture.jpg")).getImage());
        this.setTitle("Main");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        int leftTopX = centerPoint.x - this.getWidth()/2;
        int leftTopY = centerPoint.y - this.getHeight()/2;
        this.setLocation(leftTopX,leftTopY);
    }

    public static void main(String[] args) {
        _05_JFrameExample jFrameExample = new _05_JFrameExample();
        jFrameExample.setVisible(true);
    }
}
