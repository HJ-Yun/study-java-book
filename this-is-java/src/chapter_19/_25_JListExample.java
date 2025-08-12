package chapter_19;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.Vector;

public class _25_JListExample extends JFrame {
    private JPanel leftPanel;
    private JLabel rightLabel;
    private JList nameList, picList;

    public _25_JListExample(){
        setTitle("JList Example");
        setSize(250,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(getRightLabel(), BorderLayout.EAST);
        getContentPane().add(getLeftPanel(), BorderLayout.CENTER);
        }

    private JLabel getRightLabel(){
        if (rightLabel == null){
            rightLabel = new JLabel();
            rightLabel.setHorizontalAlignment(JLabel.CENTER);
            rightLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));
        }
        return rightLabel;
    }

    private JPanel getLeftPanel(){
        if (leftPanel == null){
            leftPanel = new JPanel();
            leftPanel.setLayout(new GridLayout(2,1));
            leftPanel.add(new JScrollPane(getNameList()));
            leftPanel.add(new JScrollPane(getPicList()));
        }
        return leftPanel;
    }

    private JList getNameList(){
        if (nameList == null){
            String[] items = {"Cantaloupe", "Grapefruit", "Grapes", "Kiwi",
                    "Peach", "pineapple", "strawberry", "tomato", "watermelon"};
            nameList = new JList(items);
            nameList.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (!e.getValueIsAdjusting()){
                        int selectedIndex = nameList.getSelectedIndex();
                        ImageIcon image = new ImageIcon(
                                getClass().getResource("source/fruit" + (selectedIndex+1) + ".jpg")
                        );
                        getRightLabel().setIcon(image);
                    }
                }
            });
        }
        return nameList;
    }
    private JList getPicList(){
        if (picList == null){
            Vector items = new Vector();
            for (int i = 1; i < 10; i++){
                ImageIcon image = new ImageIcon(
                        getClass().getResource("source/fruit" + i + ".jpg")
                );
                items.addElement(image);
            }
            picList = new JList(items);
            picList.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (!e.getValueIsAdjusting()){
                        ImageIcon image = (ImageIcon) picList.getSelectedValue();
                        getRightLabel().setIcon(image);
                    }
                }
            });
        }
        return picList;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _25_JListExample JFrame = new _25_JListExample();
                JFrame.setVisible(true);
            }
        });
    }
}
