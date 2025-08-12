package chapter_19;

import javax.swing.*;
import java.awt.*;

public class _12_CardLayoutExample extends JFrame {
    private JPanel redCard, greenCard, blueCard;

    public _12_CardLayoutExample(){
        setTitle("Card Layout Example");
        setSize(250,400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setLayout(new CardLayout());
        getContentPane().add(getRedCard());
        getContentPane().add(getGreenCard());
        getContentPane().add(getBlueCard());
    }

    private JPanel getRedCard(){
        if (redCard == null){
            redCard = new JPanel();
            redCard.setBackground(Color.RED);
        }
        return redCard;
    }
    private JPanel getGreenCard(){
        if (greenCard == null){
            greenCard = new JPanel();
            greenCard.setBackground(Color.GREEN);
        }
        return greenCard;
    }
    private JPanel getBlueCard(){
        if (blueCard == null){
            blueCard = new JPanel();
            blueCard.setBackground(Color.BLUE);
        }
        return blueCard;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _12_CardLayoutExample cardLayoutExample = new _12_CardLayoutExample();
                cardLayoutExample.setVisible(true);

                Thread thread = new Thread() {
                    @Override
                    public void run(){
                        for (int i = 0; i < 10; i++){
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e){
                                //
                            }
                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    CardLayout cardLayout = (CardLayout) cardLayoutExample.getContentPane().getLayout();
                                    cardLayout.next(cardLayoutExample.getContentPane());
                                }
                            });
                        }
                    }
                };
                thread.start();
            }
        });
    }
}
