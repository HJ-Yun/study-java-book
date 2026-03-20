package chapter_19;

import javax.swing.*;

public class _27_JTableExample1 extends JFrame {
    private JTable jTable;

    public _27_JTableExample1(){
        setTitle("JTable Example_1");
        setSize(200,125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(new JScrollPane(getjTable()));
    }

    private JTable getjTable(){
        if (jTable == null){
            String[] names = {"Name", "Age"};
            Object[][] data = {
                    {"Nick", 20},
                    {"Paul", 26},
                    {"Mike", 23},
                    {"Tom", 29},
                    {"Jerry", 18},
                    {"Sherry", 30},
            };
            jTable = new JTable(data, names);
            jTable.getColumn("Name").setPreferredWidth(100);
            jTable.getColumn("Age").setPreferredWidth(50);
        }
        return jTable;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _27_JTableExample1 JFrame = new _27_JTableExample1();
                JFrame.setVisible(true);
            }
        });
    }
}
