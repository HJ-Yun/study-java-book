package chapter_19;

import javax.swing.*;
import java.awt.*;

public class _09_FlowLayoutExample extends JFrame {
    private JButton btnOK;
    private JButton btnCancel;

    public _09_FlowLayoutExample(){
        setTitle("Flow Layout Example");
        setSize(300,100);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        getContentPane().add(getBtnOK());
        getContentPane().add(getBtnCancel());
    }

    private JButton getBtnOK(){
        if (btnOK == null){
            btnOK = new JButton();
            btnOK.setText("OK");
        }
        return btnOK;
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
                _09_FlowLayoutExample flowLayout = new _09_FlowLayoutExample();
                flowLayout.setVisible(true);
            }
        });

    }
}
