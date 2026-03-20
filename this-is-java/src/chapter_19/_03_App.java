package chapter_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class _03_App extends JFrame {
    public _03_App(){
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
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _03_App app = new _03_App();
                app.setVisible(true);
                System.out.println(Thread.currentThread().getName());
            }
        });

    }


}
