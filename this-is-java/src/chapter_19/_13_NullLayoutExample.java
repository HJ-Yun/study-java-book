package chapter_19;

import javax.swing.*;

public class _13_NullLayoutExample extends JFrame {
    private JButton btnOk;

    public _13_NullLayoutExample(){
        setTitle("Null Layout Example");
        setSize(300,200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setLayout(null);
        getContentPane().add(getBtnOk());
    }

    private JButton getBtnOk(){
        if (btnOk == null){
            btnOk = new JButton();
            btnOk.setText("Ok");
            btnOk.setBounds(100,50,70,60);
        }
        return btnOk;
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _13_NullLayoutExample nullLayoutExample = new _13_NullLayoutExample();
                nullLayoutExample.setVisible(true);
            }
        });
    }
}
