package chapter_19;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class _18_JToggleButtonExample extends JFrame {
    private JPanel panel1, panel2;
    private JToggleButton tbOnOff, tbStart, tbStop;

    public _18_JToggleButtonExample(){
        setTitle("JToggle Button Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));

        getContentPane().add(getPanel1());
        getContentPane().add(getPanel2());

        pack();
    }

    private JPanel getPanel1(){
        if (panel1 == null){
            panel1 = new JPanel();
            panel1.add(getTbOnOff());
        }
        return panel1;
    }

    private JPanel getPanel2(){
        if (panel2 == null){
            panel2 = new JPanel();
            panel2.setBorder(new TitledBorder("Which button?"));
            panel2.add(getTbStart());
            panel2.add(getTbStop());

            ButtonGroup btGroup = new ButtonGroup();
            btGroup.add(getTbStart());
            btGroup.add(getTbStop());
        }
        return panel2;
    }

    private JToggleButton getTbOnOff(){
        if (tbOnOff == null){
            tbOnOff = new JToggleButton();
            tbOnOff.setText("On");
            tbOnOff.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED){
                        getTbOnOff().setText("Off");
                    } else {
                        getTbOnOff().setText("On");
                    }
                }
            });
        }
        return tbOnOff;
    }

    private JToggleButton getTbStart(){
        if (tbStart == null){
            tbStart = new JToggleButton();
            tbStart.setText("Start");
            tbStart.setBackground(Color.WHITE);
            tbStart.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(_18_JToggleButtonExample.this, "Start");
                }
            });
        }
        return tbStart;
    }
    private JToggleButton getTbStop(){
        if (tbStop == null){
            tbStop = new JToggleButton();
            tbStop.setText("Stop");
            tbStop.setBackground(Color.YELLOW);
            tbStop.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(_18_JToggleButtonExample.this, "Stop");
                }
            });
        }
        return tbStop;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _18_JToggleButtonExample JFrame = new _18_JToggleButtonExample();
                JFrame.setVisible(true);
            }
        });
    }
}
