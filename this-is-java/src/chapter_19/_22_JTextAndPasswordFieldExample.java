package chapter_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class _22_JTextAndPasswordFieldExample extends JFrame{
    private JLabel labelId, labelPw;
    private JTextField fieldId;
    private JPasswordField fieldPw;

    public _22_JTextAndPasswordFieldExample(){
        setTitle("JText and JPassword Example");
        setSize(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,2));

        getContentPane().add(getLabelId());
        getContentPane().add(getFieldId());
        getContentPane().add(getLabelPw());
        getContentPane().add(getFieldPw());
    }

    private JLabel getLabelId(){
        if (labelId == null){
            labelId = new JLabel();
            labelId.setText("ID : ");
            labelId.setOpaque(true);
            labelId.setBackground(Color.WHITE);
        }
        return labelId;
    }
    private JLabel getLabelPw(){
        if (labelPw == null){
            labelPw = new JLabel();
            labelPw.setText("PW : ");
            labelPw.setOpaque(true);
            labelPw.setBackground(Color.WHITE);
        }
        return labelPw;
    }
    private JTextField getFieldId(){
        if (fieldId == null){
            fieldId = new JTextField();
            fieldId.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if (KeyEvent.VK_A <= e.getKeyCode() && e.getKeyCode() <= KeyEvent.VK_Z){
                        JOptionPane.showMessageDialog(_22_JTextAndPasswordFieldExample.this, "English");
                    } else {
                        JOptionPane.showMessageDialog(_22_JTextAndPasswordFieldExample.this, "Not English");
                    }
                }
            });
        }
        return fieldId;
    }
    private JPasswordField getFieldPw(){
        if (fieldPw == null){
            fieldPw = new JPasswordField();
            fieldPw.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String password = new String(fieldPw.getPassword());
                    JOptionPane.showMessageDialog(_22_JTextAndPasswordFieldExample.this, "PW : " + password);
                }
            });
        }
        return fieldPw;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _22_JTextAndPasswordFieldExample JFrame = new _22_JTextAndPasswordFieldExample();
                JFrame.setVisible(true);
            }
        });
    }
}
