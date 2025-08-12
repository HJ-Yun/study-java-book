package chapter_19;

import javax.swing.*;
import java.awt.*;

public class _11_GridLayoutExample extends JFrame {
    private JButton[][] btn;

    public _11_GridLayoutExample(){
        setTitle("Grid Layout Example");
        setSize(300,100);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(2,3));
        for (int r = 0; r < 2; r++){
            for (int c = 0; c < 3; c++){
                getContentPane().add(getBtn()[r][c]);
            }
        }
    }

    private JButton[][] getBtn(){
        if (btn == null){
            btn = new JButton[2][3];
            for (int r = 0; r < 2; r++){
                for (int c = 0; c < 3; c++){
                    btn[r][c] = new JButton();
                    btn[r][c].setText("[" + r + "] [" + c + "]");
                }
            }
        }
        return btn;
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _11_GridLayoutExample gridLayoutExample = new _11_GridLayoutExample();
                gridLayoutExample.setVisible(true);
            }
        });
    }
}
