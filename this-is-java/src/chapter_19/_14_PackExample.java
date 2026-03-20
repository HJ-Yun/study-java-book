package chapter_19;

import javax.swing.*;
import java.awt.*;

public class _14_PackExample extends JFrame{
    private JButton btnOk;
    private JButton btnCancel;

    public _14_PackExample(){
        setTitle("Pack Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        getContentPane().add(getBtnOk());
        getContentPane().add(getBtnCancel());

        pack();
    }

    private JButton getBtnOk(){
        if (btnOk == null){
            btnOk = new JButton();
            btnOk.setText("Ok");
        }
        return btnOk;
    }
    private JButton getBtnCancel(){
        if (btnCancel == null){
            btnCancel = new JButton();
            btnCancel.setText("Cancel");
        }
        return btnCancel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _14_PackExample packExample = new _14_PackExample();
                packExample.setVisible(true);
            }
        });
    }
}
