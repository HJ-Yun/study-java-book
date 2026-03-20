package chapter_19;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class _27_JTableExample5 extends JFrame {
    private JTable jTable;
    private JPanel jPanel;
    private JTextField txtName, txtAge;
    private JButton btnInsert, btnUpdate, btnDelete;

    public _27_JTableExample5(){
        setTitle("JTable Example_5");
        setSize(250,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add
        getContentPane().add(getjTable(), BorderLayout.CENTER);
        getContentPane().add(getjPanel(), BorderLayout.SOUTH);
    }

    private JTable getjTable(){
        if (jTable == null){
            jTable = new JTable();
            final DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
            tableModel.addColumn("Name");
            tableModel.addColumn("Age");

            jTable.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int rowIndex = jTable.getSelectedRow();
                    String name = (String) tableModel.getValueAt(rowIndex,0);
                    String age = (String) tableModel.getValueAt(rowIndex,1);

                    if (rowIndex != -1){
                        getTxtName().setText(name);
                        getTxtAge().setText(age.toString());
                    }
                }
            });
        }
        return jTable;
    }

    private JPanel getjPanel(){
        if (jPanel == null){
            jPanel = new JPanel();
            jPanel.setLayout(new GridLayout(3,1));

            JPanel panelName = new JPanel();
            panelName.setLayout(new GridLayout(1,2));
            panelName.add(new JLabel("Name : "));
            panelName.add(getTxtName());
            jPanel.add(panelName);

            JPanel panelAge = new JPanel();
            panelAge.setLayout(new GridLayout(1,2));
            panelAge.add(new JLabel("Age : "));
            panelAge.add(getTxtAge());
            jPanel.add(panelAge);

            JPanel panelBtn = new JPanel();
            panelBtn.setLayout(new FlowLayout());
            panelBtn.add(getBtnInsert());
            panelBtn.add(getBtnUpdate());
            panelBtn.add(getBtnDelete());
            jPanel.add(panelBtn);
        }
        return jPanel;
    }
    private JTextField getTxtName(){
        if (txtName == null){
            txtName = new JTextField();
        }
        return txtName;
    }
    private JTextField getTxtAge(){
        if (txtAge == null){
            txtAge = new JTextField();
        }
        return txtAge;
    }

    private JButton getBtnInsert(){
        if (btnInsert == null){
            btnInsert = new JButton();
            btnInsert.setText("Insert");

            btnInsert.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Object[] data = new Object[] {txtName.getText(), txtAge.getText()};
                    DefaultTableModel tableModel = (DefaultTableModel) getjTable().getModel();
                    tableModel.addRow(data);
                    txtName.setText("");
                    txtAge.setText("");
                }
            });

        }
        return btnInsert;
    }
    private JButton getBtnUpdate(){
        if (btnUpdate == null){
            btnUpdate = new JButton();
            btnUpdate.setText("Update");
            btnUpdate.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DefaultTableModel tableModel = (DefaultTableModel) getjTable().getModel();
                    Vector<Vector> rows = tableModel.getDataVector();
                    Vector row = rows.elementAt(jTable.getSelectedRow());
                    row.set(0, txtName.getText());
                    row.set(1, txtAge.getText());
                    tableModel.fireTableDataChanged();
                    txtName.setText("");
                    txtAge.setText("");
                }
            });
        }
        return btnUpdate;
    }
    private JButton getBtnDelete(){
        if (btnDelete == null){
            btnDelete = new JButton();
            btnDelete.setText("Delete");
            btnDelete.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int rowIndex = jTable.getSelectedRow();
                    if (rowIndex != -1){
                        DefaultTableModel tableModel = (DefaultTableModel) getjTable().getModel();
                        tableModel.removeRow(rowIndex);
                        txtName.setText("");
                        txtAge.setText("");
                    }
                }
            });
        }
        return btnDelete;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _27_JTableExample5 JFrame = new _27_JTableExample5();
                JFrame.setVisible(true);
            }
        });
    }
}
