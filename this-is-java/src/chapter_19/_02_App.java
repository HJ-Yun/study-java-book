package chapter_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class _02_App extends JFrame {
    public _02_App(){
        setTitle("Swing App");
        setSize(300,100);
        getContentPane().add(new JButton("Ok"), BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        _02_App app = new _02_App();
        app.setVisible(true);
    }
}
