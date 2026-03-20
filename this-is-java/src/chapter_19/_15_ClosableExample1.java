package chapter_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class _15_ClosableExample1 extends JFrame{
    private JButton btn;

    public _15_ClosableExample1(){
        setTitle("Closable Example");
        setSize(300,100);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        getContentPane().add(getBtn());

        addWindowListener(new MyWindowAdapter());
    }

    private JButton getBtn(){
        if (btn == null){
            btn = new JButton();
            btn.setText("Close");

            btn.addActionListener(new MyActionListener());
        }
        return btn;
    }

    class MyWindowAdapter extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }

    class MyActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _15_ClosableExample1 closableExample1 = new _15_ClosableExample1();
                closableExample1.setVisible(true);
            }
        });
    }
}
