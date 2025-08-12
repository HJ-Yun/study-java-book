package chapter_19;

import javax.swing.*;

public class _29_JMenuExample1 extends JFrame {
    private JMenuBar jMenuBar;
    private JMenu menuFile, menuHelp;
    private JMenu fileMake;
    private JMenuItem makeFile, makeFolder;
    private JMenuItem fileOpen, fileSave, fileExit;

    public _29_JMenuExample1(){
        setTitle("JMenu Example_1");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setJMenuBar(getjMenuBar());
    }
    private JMenuBar getjMenuBar(){
        if (jMenuBar == null){
            jMenuBar = new JMenuBar();
            jMenuBar.add(getMenuFile());
            jMenuBar.add(getMenuHelp());
        }
        return jMenuBar;
    }

    private JMenu getMenuFile(){
        if (menuFile == null){
            menuFile = new JMenu("File");
            menuFile.add(getFileMake());
            menuFile.add(getFileOpen());
            menuFile.add(getFileSave());
            menuFile.add(new JSeparator());
            menuFile.add(getFileExit());
        }
        return menuFile;
    }

    private JMenu getFileMake(){
        if (fileMake == null){
            fileMake = new JMenu("New");
            fileMake.add(getMakeFile());
            fileMake.add(getMakeFolder());
        }
        return fileMake;
    }
    private JMenuItem getMakeFile(){
        if (makeFile == null){
            makeFile = new JMenuItem("New File");
        }
        return makeFile;
    }
    private JMenuItem getMakeFolder(){
        if (makeFolder == null){
            makeFolder = new JMenuItem("New Folder");
        }
        return makeFolder;
    }

    private JMenuItem getFileOpen(){
        if (fileOpen == null){
            fileOpen = new JRadioButtonMenuItem("Open");
        }
        return fileOpen;
    }
    private JMenuItem getFileSave(){
        if (fileSave == null){
            fileSave = new JCheckBoxMenuItem("Save");
        }
        return fileSave;
    }
    private JMenuItem getFileExit(){
        if (fileExit == null){
            fileExit = new JMenuItem("Exit");
        }
        return fileExit;
    }

    private JMenu getMenuHelp(){
        if (menuHelp == null){
            menuHelp = new JMenu("Help");
        }
        return menuHelp;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _29_JMenuExample1 JFrame = new _29_JMenuExample1();
                JFrame.setVisible(true);
            }
        });
    }

}
