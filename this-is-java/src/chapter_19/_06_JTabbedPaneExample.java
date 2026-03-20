package chapter_19;

import javax.swing.*;
import java.awt.*;

public class _06_JTabbedPaneExample extends JFrame {
    private JTabbedPane jTabbedPane;
    private JPanel tab1Panel;
    private JPanel tab2Panel;

    private JPanel getTab1Panel(){
        if (tab1Panel == null){
            tab1Panel = new JPanel();
            JLabel jLabel = new JLabel();
            jLabel.setIcon(new ImageIcon(getClass().getResource("source/gifSample1.gif")));
            tab1Panel.add(jLabel);
        }
        return tab1Panel;
    }

    private JPanel getTab2Panel(){
        if (tab2Panel == null){
            tab2Panel = new JPanel();
            JLabel jLabel = new JLabel();
            jLabel.setIcon(new ImageIcon(getClass().getResource("source/gifSample2.gif")));
            tab2Panel.add(jLabel);
        }
        return tab2Panel;
    }


    private JTabbedPane getjTabbedPane(){
        if (jTabbedPane == null){
            jTabbedPane = new JTabbedPane();
            jTabbedPane.setTabPlacement(JTabbedPane.LEFT);
            jTabbedPane.addTab("Tab1",getTab1Panel());
            jTabbedPane.addTab("Tab2",getTab2Panel());
        }
        return jTabbedPane;
    }

    public _06_JTabbedPaneExample(){
        this.setTitle("JTabbedPane Example");
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(getjTabbedPane(), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _06_JTabbedPaneExample jFrame = new _06_JTabbedPaneExample();
                jFrame.setVisible(true);
            }
        });
    }
}
