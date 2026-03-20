package chapter_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _31_JFrameExample extends JFrame {
    private JButton btnDialog;

    public _31_JFrameExample(){
        setTitle("JFrame Example_1");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(getBtnDialog(), BorderLayout.SOUTH);
    }

    private JButton getBtnDialog(){
        if (btnDialog == null){
            btnDialog = new JButton("Open the Dialog");
            btnDialog.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    _31_JDialogExample jDialog = new _31_JDialogExample(_31_JFrameExample.this);
                    jDialog.setVisible(true);
                }
            });
        }
        return btnDialog;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _31_JFrameExample JFrame = new _31_JFrameExample();
                JFrame.setVisible(true);
            }
        });
    }
}
