package chapter_19;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _27_JTableExample2 extends JFrame {
    private JTable jTable;
    private JButton jButton;

    public _27_JTableExample2(){
        setTitle("JTable Example_2");
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(getjButton(), BorderLayout.SOUTH);
        getContentPane().add(new JScrollPane(getjTable()), BorderLayout.CENTER);
    }

    private JTable getjTable() {
        if (jTable == null) {
            String[] names = {"Name", "Age"};
            Object[][] data = {
                    {"Nick", 20},
                    {"Paul", 26},
                    {"Mike", 23},
                    {"Tom", 29},
                    {"Jerry", 18},
                    {"Sherry", 30},
            };
            jTable = new JTable(data,names);
        } return jTable;
    }

    private JButton getjButton(){
        if (jButton == null){
            jButton = new JButton();
            jButton.setText("Click it!");
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    TableModel tableModel = getjTable().getModel();
                    int columnCount = tableModel.getColumnCount();
                    int rawCount = tableModel.getRowCount();

                    for (int i = 0; i < columnCount; i++){
                        String columnName = tableModel.getColumnName(i);
                        System.out.print(columnName + "\t\t");
                    }
                    System.out.println();
                    System.out.println("----------------------------------");

                    for (int i = 0; i < rawCount; i++){
                        String rawName = (String) tableModel.getValueAt(i,0);
                        Integer rawAge = (Integer) tableModel.getValueAt(i,1);
                        System.out.println(rawName + "\t\t" + rawAge);
                    }

                    tableModel.setValueAt("Changed",0,0);
                    tableModel.setValueAt(0,0,1);
                }
            });
        }
        return jButton;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _27_JTableExample2 JFrame = new _27_JTableExample2();
                JFrame.setVisible(true);
            }
        });
    }
}
