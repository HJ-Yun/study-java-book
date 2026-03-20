package chapter_19;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class _01_App extends Frame {
    public _01_App(){
        setTitle("AWT App");
        setSize(300,100);
        add(new Button("Ok"),BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        _01_App app = new _01_App();
        app.setVisible(true);
    }
}
