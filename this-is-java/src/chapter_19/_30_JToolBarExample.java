package chapter_19;

import javax.swing.*;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _30_JToolBarExample extends JFrame {
    private JMenuBar jMenuBar;
    private JMenu file, save;
    private JToolBar toolBar;
    private JButton jNew, jSave, jCopy, jPaste;
    public _30_JToolBarExample(){
        setTitle("JToolBar Example");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setJMenuBar(getjMenuBar());
        getContentPane().add(getToolBar(), BorderLayout.NORTH);
    }

    private JMenuBar getjMenuBar(){
        if (jMenuBar == null){
            jMenuBar = new JMenuBar();
            jMenuBar.add(getFile());
            jMenuBar.add(getSave());
        }
        return jMenuBar;
    }
    private JMenu getFile(){
        if (file == null){
            file = new JMenu("File");
        }
        return file;
    }
    private JMenu getSave(){
        if (save == null){
            save = new JMenu("Save");
        }
        return save;
    }

    private JToolBar getToolBar(){
        if (toolBar == null){
            toolBar = new JToolBar();
            toolBar.add(new JToolBar.Separator());
            toolBar.add(getjNew());
            toolBar.add(getjSave());
            toolBar.add(new JToolBar.Separator());
            toolBar.add(getjCopy());
            toolBar.add(getjPaste());
            toolBar.setFloatable(false);
        }
        return toolBar;
    }
    private JButton getjNew(){
        if (jNew == null){
            jNew = new JButton();
            jNew.setText("New");
            jNew.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
            jNew.setToolTipText("Make New File");
            jNew.addActionListener(ac);

        }
        return jNew;
    }
    private JButton getjSave(){
        if (jSave == null){
            jSave = new JButton();
            jSave.setText("Save");
            jSave.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
            jSave.setToolTipText("Save the File");
            jSave.addActionListener(ac);
        }
        return jSave;
    }
    private JButton getjCopy(){
        if (jCopy == null){
            jCopy = new JButton();
            jCopy.setText("Copy");
            jCopy.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
            jCopy.setToolTipText("Copy the File");
            jCopy.addActionListener(ac);
        }
        return jCopy;
    }
    private JButton getjPaste(){
        if (jPaste == null){
            jPaste = new JButton();
            jPaste.setText("Paste");
            jPaste.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
            jPaste.setToolTipText("Paste the File");
            jPaste.addActionListener(ac);
        }
        return jPaste;
    }

    private ActionListener ac = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jNew){
                JOptionPane.showMessageDialog(_30_JToolBarExample.this, "Clicked New Button");
            } else if (e.getSource() == jSave) {
                JOptionPane.showMessageDialog(_30_JToolBarExample.this, "Clicked Save Button");
            } else if (e.getSource() == jCopy) {
                JOptionPane.showMessageDialog(_30_JToolBarExample.this, "Clicked Copy Button");
            } else if (e.getSource() == jPaste) {
                JOptionPane.showMessageDialog(_30_JToolBarExample.this, "Clicked Paste Button");
            }
        }
    };

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _30_JToolBarExample JFrame = new _30_JToolBarExample();
                JFrame.setVisible(true);
            }
        });
    }
}
