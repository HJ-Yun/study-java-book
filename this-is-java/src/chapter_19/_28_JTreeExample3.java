package chapter_19;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class _28_JTreeExample3 extends JFrame {
    private JTree jTree;

    public _28_JTreeExample3(){
        setTitle("JTree Example_3");
        setSize(200,125);
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

            jTree = new JTree(root);
            jTree.setCellRenderer(new TreeRender());

            jTree.addMouseListener(mouseListener);
            jTree.addTreeSelectionListener(treeSelectionListener);

        }
        return jTree;
    }

    private TreeSelectionListener treeSelectionListener = new TreeSelectionListener() {
        @Override
        public void valueChanged(TreeSelectionEvent e) {
            TreePath treePath = e.getPath();
            DefaultMutableTreeNode tn = (DefaultMutableTreeNode) treePath.getLastPathComponent();
            String nodeTxt = (String) tn.getUserObject();
            JOptionPane.showMessageDialog(_28_JTreeExample3.this, "Tree Clicked : " + nodeTxt);
        }
    };

    private MouseListener mouseListener = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2){
                TreePath treePath = jTree.getPathForLocation(e.getX(), e.getY());
                DefaultMutableTreeNode tn = (DefaultMutableTreeNode) treePath.getLastPathComponent();
                String nodeTxt = (String) tn.getUserObject();
                JOptionPane.showMessageDialog(_28_JTreeExample3.this, "Double Clicked : " + nodeTxt);
            }
        }
    };

    public class TreeRender implements TreeCellRenderer{
        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
            if (!leaf){
                JLabel jLabel = new JLabel();
                jLabel.setOpaque(true);
                jLabel.setBackground(Color.GREEN);
                jLabel.setText(value.toString());
                if (selected){
                    jLabel.setBackground(Color.YELLOW);
                }
                return jLabel;
            } else {
                JLabel jLabel = new JLabel();
                jLabel.setOpaque(true);
                jLabel.setBackground(Color.WHITE);
                jLabel.setText(value.toString());
                if (selected){
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
                _28_JTreeExample3 JFrame = new _28_JTreeExample3();
                JFrame.setVisible(true);
            }
        });
    }
}
