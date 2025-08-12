package chapter_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _16_ActionListenerExample extends JFrame{
    private JButton btnOk;
    private JButton btnCancel;

    public _16_ActionListenerExample(){
        setTitle("Action Listener Example");
        setSize(300,100);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        getContentPane().add(getBtnOk());
        getContentPane().add(getBtnCancel());
    }

    private ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnOk){
                System.out.println("btnOK");
            } else if (e.getSource() == btnCancel) {
                System.out.println("btnCancel");
            }
        }
    };

    private JButton getBtnOk(){
        if (btnOk == null){
            btnOk = new JButton();
            btnOk.setText("OK");
            btnOk.addActionListener(actionListener);
        }
        return btnOk;
    }
    private JButton getBtnCancel(){
        if (btnCancel == null){
            btnCancel = new JButton();
            btnCancel.setText("Cancel");
            btnCancel.addActionListener(actionListener);
        }
        return btnCancel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _16_ActionListenerExample jFrame = new _16_ActionListenerExample();
                jFrame.setVisible(true);
            }
        });
    }
}
