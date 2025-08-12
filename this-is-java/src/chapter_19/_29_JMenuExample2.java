package chapter_19;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _29_JMenuExample2 extends JFrame {
    private JMenuBar jMenuBar;
    private JMenu jMenu;
    private JMenuItem jSave, jExit;

    public _29_JMenuExample2(){
        setTitle("JMenu Example_2");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setJMenuBar(getjMenuBar());
    }

    private JMenuBar getjMenuBar(){
        if (jMenuBar == null){
            jMenuBar = new JMenuBar();
            jMenuBar.add(getjMenu());
        }
        return jMenuBar;
    }

    private JMenu getjMenu(){
        if (jMenu == null){
            jMenu = new JMenu("File");
            jMenu.add(getjSave());
            jMenu.add(new JSeparator());
            jMenu.add(getjExit());
        }
        return jMenu;
    }
    private JMenuItem getjSave(){
        if (jSave == null){
            jSave = new JCheckBoxMenuItem("Save");
            jSave.addActionListener(ac);
        }
        return jSave;
    }
    private JMenuItem getjExit(){
        if (jExit == null){
            jExit = new JMenuItem("Exit");
            jExit.addActionListener(ac);
        }
        return jExit;
    }

    private ActionListener ac = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jSave){
                if (jSave.isSelected()){
                    JOptionPane.showMessageDialog(_29_JMenuExample2.this, "Checked");
                } else {
                    JOptionPane.showMessageDialog(_29_JMenuExample2.this, "UnChecked");
                }
            } else if (e.getSource() == jExit) {
                System.exit(0);
            }
        }
    };

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _29_JMenuExample2 JFrame = new _29_JMenuExample2();
                JFrame.setVisible(true);
            }
        });
    }
}
