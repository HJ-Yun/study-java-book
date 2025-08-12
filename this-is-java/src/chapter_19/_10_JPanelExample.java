package chapter_19;

import javax.swing.*;
import java.awt.*;

public class _10_JPanelExample extends JFrame {
    private JPanel panel;
    private JButton btnOk;
    private JButton btnCancel;

    public _10_JPanelExample(){
        setTitle("JPanel Example");
        setSize(250,200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(getPanel(), BorderLayout.SOUTH);
    }
    private JPanel getPanel(){
        if (panel == null){
            panel = new JPanel();
            panel.setBackground(Color.WHITE);
            panel.add(getBtnOk());
            panel.add(getBtnCancel());
        }
        return panel;
    }

    private JButton getBtnOk(){
        if (btnOk == null){
            btnOk = new JButton();
            btnOk.setText("OK");
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
                _10_JPanelExample jPanelExample = new _10_JPanelExample();
                jPanelExample.setVisible(true);
            }
        });
    }
}
