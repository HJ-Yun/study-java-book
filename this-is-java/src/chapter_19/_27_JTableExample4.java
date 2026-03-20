package chapter_19;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class _27_JTableExample4 extends JFrame {
    private JTable jTable;
    private JPanel panel;
    private JTextField txtName, txtAge;
    private Object[][] data;
    private String[] names;

    public _27_JTableExample4(){
        setTitle("JTable Example_4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(new JScrollPane(getjTable()), BorderLayout.CENTER);
        getContentPane().add(getPanel(), BorderLayout.SOUTH);
        setSize(200,230);
    }

    public JTable getjTable(){
        if (jTable == null){
            names = new String[]{"Name", "Age"};
            data = new Object[][]{
                    {"Nick", 20},
                    {"Paul", 26},
                    {"Mike", 23},
                    {"Tom", 29},
                    {"Jerry", 18},
                    {"Sherry", 30},
            };
            jTable = new JTable(data,names);

            jTable.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int rowIndex = jTable.getSelectedRow();
                    if (rowIndex != -1){
                        TableModel tableModel = jTable.getModel();
                        String name = (String) tableModel.getValueAt(rowIndex,0);
                        Integer age = (Integer) tableModel.getValueAt(rowIndex,1);

                        getTxtName().setText(name);
                        getTxtAge().setText(String.valueOf(age.intValue()));
                    }
                }
            });
        }
        return jTable;
    }

    public JPanel getPanel(){
        if (panel == null){
            panel = new JPanel();
            panel.setLayout(new GridLayout(4,2));
            panel.add(new JLabel("Selected Table"));
            panel.add(new JLabel(""));
            panel.add(new JLabel("Name", JLabel.CENTER));
            panel.add(getTxtName());
            panel.add(new JLabel("Age", JLabel.CENTER));
            panel.add(getTxtAge());
        }
        return panel;
    }

    public JTextField getTxtName(){
        if (txtName == null){
            txtName = new JTextField();
        }
        return txtName;
    }
    public JTextField getTxtAge(){
        if (txtAge == null){
            txtAge = new JTextField();
        }
        return txtAge;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _27_JTableExample4 JFrame = new _27_JTableExample4();
                JFrame.setVisible(true);
            }
        });
    }
}
