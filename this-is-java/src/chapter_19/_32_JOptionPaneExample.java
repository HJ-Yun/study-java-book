package chapter_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _32_JOptionPaneExample extends JFrame {
    private JButton btnMessage, btnConfirm;
    private JButton btnInput, btnOption;

    public _32_JOptionPaneExample(){
        setTitle("JOptionPane Example");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,1));

        getContentPane().add(getBtnMessage());
        getContentPane().add(getBtnConfirm());
        getContentPane().add(getBtnInput());
        getContentPane().add(getBtnOption());
    }

    private JButton getBtnMessage() {
        if (btnMessage == null){
            btnMessage = new JButton("Message Dialog Button");
            btnMessage.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(_32_JOptionPaneExample.this,
                            "Clicked Message Dialog Button",
                            "Message Dialog Tittle",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            });
        }
        return btnMessage;
    }

    public JButton getBtnConfirm() {
        if (btnConfirm == null){
            btnConfirm = new JButton("Confirm Dialog Button");
            btnConfirm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int option = JOptionPane.showConfirmDialog(_32_JOptionPaneExample.this,
                            "Clicked Confirm Dialog Button",
                            "Confirm Dialog Tittle",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.PLAIN_MESSAGE,
                            null);
                    if (option == JOptionPane.OK_OPTION){
                        System.out.println("OK Clicked");
                    } else if (option == JOptionPane.CANCEL_OPTION) {
                        System.out.println("Cancel Clicked");
                    } else if (option == JOptionPane.CLOSED_OPTION) {
                        System.out.println("Close Clicked");
                    }
                }
            });
        }
        return btnConfirm;
    }

    private JButton getBtnInput() {
        if (btnInput == null){
            btnInput = new JButton("Input Dialog Button");
            btnInput.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String input = null;

                    input = JOptionPane.showInputDialog(_32_JOptionPaneExample.this,
                            "Clicked Input Dialog Button",
                            "Input Dialog Tittle",
                            JOptionPane.PLAIN_MESSAGE);
                    System.out.println("Input Text : " + input);

                    input = (String) JOptionPane.showInputDialog(_32_JOptionPaneExample.this,
                            "Dialog Input",
                            "Dialog Tittle",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            new String[] {"java", "Java", "JAVA", "JaVa"},
                            "JDBC");
                    System.out.println("Input Text : " + input);
                }
            });
        }
        return btnInput;
    }

    private JButton getBtnOption() {
        if (btnOption  == null){
            btnOption = new JButton("Option Dialog Button");
            btnOption.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int option = JOptionPane.showOptionDialog(_32_JOptionPaneExample.this,
                            "Clicked Option Dialog Button",
                            "Option Dialog Tittle",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            new String[] {"Start", "Stop"},
                            "Start");
                    if (option == 0){
                        System.out.println("Pressed Start Button");
                    } else if (option == 1) {
                        System.out.println("Pressed Stop Button");
                    }
                }
            });
        }
        return btnOption;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _32_JOptionPaneExample JFrame = new _32_JOptionPaneExample();
                JFrame.setVisible(true);
            }
        });
    }
}
