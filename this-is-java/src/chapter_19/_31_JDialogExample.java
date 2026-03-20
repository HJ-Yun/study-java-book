package chapter_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _31_JDialogExample extends JDialog {
    private JButton btnClose;

    public _31_JDialogExample(JFrame owner){
        super(owner);
        setTitle("JDialog Example_1");
        setSize(300,200);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setResizable(false);
        setModal(true);
        setLocation(
                owner.getLocationOnScreen().x + (owner.getWidth() - this.getWidth()) / 2,
                owner.getLocationOnScreen().y + (owner.getHeight() - this.getHeight()) / 2
        );
        getContentPane().add(getBtnClose(), BorderLayout.SOUTH);
    }

    private JButton getBtnClose(){
        if (btnClose == null){
            btnClose = new JButton("Close the Dialog");
            btnClose.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    _31_JDialogExample.this.dispose();
                }
            });
        }
        return btnClose;
    }
}
