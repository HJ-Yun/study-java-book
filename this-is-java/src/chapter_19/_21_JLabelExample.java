package chapter_19;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class _21_JLabelExample extends JFrame {
    private JLabel jLabel1, jLabel2, jLabel3, jLabel4;

    public _21_JLabelExample(){
        setTitle("JLabel Example");
        setSize(200,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,1));

        getContentPane().add(getJLabel1());
        getContentPane().add(getJLabel2());
        getContentPane().add(getJLabel3());
        getContentPane().add(getJLabel4());

    }

    private JLabel getJLabel1(){
        if (jLabel1 == null){
            jLabel1 = new JLabel();
            jLabel1.setText("JLabel_1");
            jLabel1.setHorizontalAlignment(JLabel.LEFT);
            jLabel1.setBorder(new EtchedBorder());
        }
        return jLabel1;
    }
    private JLabel getJLabel2(){
        if (jLabel2 == null){
            jLabel2 = new JLabel();
            jLabel2.setIcon(new ImageIcon(getClass().getResource("source/gifSample1.gif")));
            jLabel2.setText("JLabel_2");
            jLabel2.setHorizontalAlignment(JLabel.CENTER);
            jLabel2.setBorder(new TitledBorder("JLabel_2 Title"));
        }
        return jLabel2;
    }
    private JLabel getJLabel3(){
        if (jLabel3 == null){
            jLabel3 = new JLabel();
            jLabel3.setIcon(new ImageIcon(getClass().getResource("source/gifSample1.gif")));
            jLabel3.setText("JLabel_3");
            jLabel3.setHorizontalAlignment(JLabel.CENTER);
            jLabel3.setHorizontalTextPosition(JLabel.LEFT);
            jLabel3.setBorder(new LineBorder(Color.GREEN));
        }
        return jLabel3;
    }
    private JLabel getJLabel4(){
        if (jLabel4 == null){
            jLabel4 = new JLabel();
            jLabel4.setIcon(new ImageIcon(getClass().getResource("source/gifSample1.gif")));
            jLabel4.setText("JLabel_4");
            jLabel4.setHorizontalAlignment(JLabel.CENTER);
            jLabel4.setIconTextGap(20);
            jLabel4.setBorder(new EtchedBorder());
        }
        return jLabel4;
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _21_JLabelExample JFrame = new _21_JLabelExample();
                JFrame.setVisible(true);
            }
        });
    }
}
