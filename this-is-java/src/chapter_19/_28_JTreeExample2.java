package chapter_19;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import java.awt.*;

public class _28_JTreeExample2 extends JFrame {
    private JTree jTree;

    private _28_JTreeExample2(){
        setTitle("JTree Example_2");
        setSize(200,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(new JScrollPane(getjTree()), BorderLayout.CENTER);
    }

    private JTree getjTree(){
        if (jTree == null){
            DefaultMutableTreeNode root = new DefaultMutableTreeNode("Group");

            DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Friend");
            node1.add(new DefaultMutableTreeNode("Friend_1"));
            node1.add(new DefaultMutableTreeNode("Friend_2"));
            root.add(node1);

            DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Company");
            node2.add(new DefaultMutableTreeNode("Company_1"));
            node2.add(new DefaultMutableTreeNode("Company_2"));
            root.add(node2);

            jTree = new JTree(root);
            jTree.setCellRenderer(new TreeRender());
        }
        return jTree;
    }

    private class TreeRender implements TreeCellRenderer{
        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
            if (!leaf){
                JLabel jLabel = new JLabel();
                jLabel.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));
                jLabel.setText(value.toString());
                jLabel.setOpaque(true);
                jLabel.setBackground(Color.YELLOW);
                if (selected){
                    jLabel.setBackground(Color.GREEN);
                }
                return jLabel;
            } else {
                JLabel jLabel = new JLabel();
                jLabel.setBorder(BorderFactory.createEmptyBorder(3,0,3,0));
                jLabel.setText("○ " + new String(value.toString()) + " ○");

                if (selected){
                    jLabel.setOpaque(true);
                    jLabel.setBackground(Color.PINK);
                }
                return jLabel;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _28_JTreeExample2 JFrame = new _28_JTreeExample2();
                JFrame.setVisible(true);
            }
        });
    }
}
