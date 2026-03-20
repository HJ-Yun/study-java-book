package chapter_19;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class _33_JFileChooseExample extends JFrame {
    private JButton btnOpen, btnSave;

    public _33_JFileChooseExample(){
        setTitle("JFileChoose Example");
        setSize(150,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));

        getContentPane().add(getBtnOpen());
        getContentPane().add(getBtnSave());
    }

    private JButton getBtnOpen(){
        if (btnOpen == null){
            btnOpen = new JButton("Open");
            btnOpen.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFileChooser jc = new JFileChooser();
                    jc.addChoosableFileFilter(new FileNameExtensionFilter("Picture(*.jpg, *.gif, *.bmp)","jpg","gif","bmp"));
                    jc.addChoosableFileFilter(new FileNameExtensionFilter("Text(*.txt)","txt"));

                    int option = jc.showOpenDialog(_33_JFileChooseExample.this);
                    if (option == JFileChooser.APPROVE_OPTION){
                        File file = jc.getSelectedFile();
                        System.out.println("Selected File Path : " + file.getAbsolutePath());
                        System.out.println("Selected File Name : " + file.getName());
                    } else if (option == JFileChooser.CANCEL_OPTION) {
                        System.out.println("Selected Cancel");
                    }
                }
            });
        }
        return btnOpen;
    }

    private JButton getBtnSave(){
        if (btnSave == null){
            btnSave = new JButton("Save");
            btnSave.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFileChooser jc = new JFileChooser();
                    jc.addChoosableFileFilter(new FileNameExtensionFilter("Picture(*.jpg, *.gif, *.bmp)","jpg","gif","bmp"));
                    jc.addChoosableFileFilter(new FileNameExtensionFilter("Text(*.txt)","txt"));

                    int option = jc.showOpenDialog(_33_JFileChooseExample.this);
                    if (option == JFileChooser.APPROVE_OPTION){
                        File file = jc.getSelectedFile();
                        System.out.println("Saved File Path : " + file.getAbsolutePath());
                        System.out.println("Saved File Name : " + file.getName());
                    } else if (option == JFileChooser.CANCEL_OPTION) {
                        System.out.println("Saved Cancel");
                    }
                }
            });
        }
        return btnSave;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _33_JFileChooseExample JFrame = new _33_JFileChooseExample();
                JFrame.setVisible(true);
            }
        });
    }
}
