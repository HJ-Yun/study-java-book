package chapter_19;

import javax.swing.*;
import java.awt.*;

public class _08_BorderLayoutExample extends JFrame{
    private JTextField txtNorth;
    private JTextArea txtCenter;
    private JButton btnSouth;

    public _08_BorderLayoutExample(){
        setSize(300,200);
        setTitle("Border Layout Example");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(getTxtNorth(), BorderLayout.NORTH);
        getContentPane().add(getTxtCenter(), BorderLayout.CENTER);
        getContentPane().add(getBtnSouth(), BorderLayout.SOUTH);
    }

    private JTextField getTxtNorth(){
        if (txtNorth == null){
            txtNorth = new JTextField();
            txtNorth.setText("North Component");
            txtNorth.setBackground(Color.YELLOW);
        }
        return txtNorth;
    }

    private JTextArea getTxtCenter(){
        if (txtCenter == null){
            txtCenter = new JTextArea();
            txtCenter.append("Center\n");
            txtCenter.append("Also East\n");
            txtCenter.append("Also West\n");
        }
        return txtCenter;
    }

    private JButton getBtnSouth(){
        if (btnSouth == null){
            btnSouth = new JButton();
            btnSouth.setText("South Button");
        }
        return btnSouth;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _08_BorderLayoutExample borderLayout = new _08_BorderLayoutExample();
                borderLayout.setVisible(true);
            }
        });
    }
}
