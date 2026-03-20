package chapter_19;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import java.awt.*;

public class _27_JTableExample3 extends JFrame {
    private JTable jTable;

    public _27_JTableExample3(){
        setTitle("JTable Example_3");
        setSize(200,125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(new JScrollPane(getjTable()), BorderLayout.CENTER);

    }

    private JTable getjTable(){
        if (jTable == null){
            String[] names = {"Name", "Age", "Choose"};
            Object[][] data = {
                    {"Nick", 20, true},
                    {"Paul", 26, true},
                    {"Mike", 23, false},
                    {"Tom", 29, true},
                    {"Jerry", 18, false},
                    {"Sherry", 30, false},
            };
            jTable = new JTable(data,names);

            TableColumn tcName = jTable.getColumn("Name");
            tcName.setCellRenderer(new NameRender());
            TableColumn tcAge = jTable.getColumn("Age");
            tcAge.setCellRenderer(new AgeRender());
            TableColumn tcChoose = jTable.getColumn("Choose");
            tcChoose.setCellRenderer(new ChooseRender());
        }
        return jTable;
    }

    public class NameRender extends JLabel implements TableCellRenderer{
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText(value.toString());
            setFont(new Font(null, Font.PLAIN, 12));
            setHorizontalAlignment(JLabel.CENTER);
            setOpaque(true);
            if (isSelected){
                setBackground(Color.YELLOW);
            } else {
                setBackground(Color.WHITE);
            }
            return this;
        }
    }
    public class AgeRender extends JLabel implements TableCellRenderer{
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText(value.toString());
            setFont(new Font(null, Font.PLAIN, 12));
            setHorizontalAlignment(JLabel.CENTER);
            setOpaque(true);
            if (isSelected){
                setBackground(Color.YELLOW);
            } else {
                setBackground(Color.WHITE);
            }
            return this;
        }
    }
    public class ChooseRender extends JCheckBox implements TableCellRenderer{
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Boolean boolWrapper = (Boolean) value;
            setSelected(boolWrapper.booleanValue());
            setHorizontalAlignment(CENTER);
            setOpaque(true);
            if (isSelected){
                setBackground(Color.YELLOW);
            } else {
                setBackground(Color.WHITE);
            }
            return this;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _27_JTableExample3 JFrame = new _27_JTableExample3();
                JFrame.setVisible(true);
            }
        });
    }
}
