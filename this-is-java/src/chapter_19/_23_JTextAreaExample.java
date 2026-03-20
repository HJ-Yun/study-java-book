package chapter_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _23_JTextAreaExample extends JFrame {
    private JTextArea textArea;
    private JPanel panel;
    private JTextField textField;
    private JButton button;

    public _23_JTextAreaExample(){
        setTitle("JTextArea Example");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(getPanel(), BorderLayout.SOUTH);
        getContentPane().add(new JScrollPane(getTextArea()), BorderLayout.CENTER);
    }

    public JTextArea getTextArea(){
        if (textArea == null){
            textArea = new JTextArea();
            textArea.setEditable(false);
        }
        return textArea;
    }
    public JPanel getPanel(){
        if (panel == null){
            panel = new JPanel();
            panel.setLayout(new BorderLayout());
            panel.add(getTextField(), BorderLayout.CENTER);
            panel.add(getButton(), BorderLayout.EAST);
        }
        return panel;
    }
    public JTextField getTextField(){
        if (textField == null){
            textField = new JTextField();
            textField.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getTextArea().append(getTextField().getText() + "\n");
                    getTextField().setText("");
                }
            });
        }
        return textField;
    }
    public JButton getButton(){
            button = new JButton();
            button.setText("Send");
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getTextArea().append(getTextField().getText() + "\n");
                    getTextField().setText("");
                }
            });
        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _23_JTextAreaExample JFrame = new _23_JTextAreaExample();
                JFrame.setVisible(true);
            }
        });
    }
}
