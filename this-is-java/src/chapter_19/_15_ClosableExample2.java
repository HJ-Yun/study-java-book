package chapter_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class _15_ClosableExample2 extends JFrame{
    private JButton btn;

    public _15_ClosableExample2(){
        setTitle("Closable Example");
        setSize(300,100);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        getContentPane().add(getBtn());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    private JButton getBtn(){
        if (btn == null){
            btn = new JButton();
            btn.setText("Close");
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
        }
        return btn;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _15_ClosableExample2 closableExample2 = new _15_ClosableExample2();
                closableExample2.setVisible(true);
            }
        });
    }
}
