package chapter_19;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class _28_JTreeExample1 extends JFrame {
    private JTree jTree;

    public _28_JTreeExample1(){
        setTitle("JTree Example_1");
        setSize(200,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(new JScrollPane(getjTree()), BorderLayout.CENTER);
    }

    public JTree getjTree(){
        if (jTree == null){
            DefaultMutableTreeNode root = new DefaultMutableTreeNode("Group List");

            DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Friend");
            node1.add(new DefaultMutableTreeNode("Friend_1"));
            node1.add(new DefaultMutableTreeNode("Friend_2"));
            root.add(node1);

            DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Company");
            node2.add(new DefaultMutableTreeNode("Company_1"));
            node2.add(new DefaultMutableTreeNode("Company_2"));
            root.add(node2);

            jTree = new JTree(root);
        }
        return jTree;
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _28_JTreeExample1 JFrame = new _28_JTreeExample1();
                JFrame.setVisible(true);
            }
        });
    }
}
