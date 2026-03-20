package chapter_19;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.io.IOException;

public class _24_JEditorPaneExample extends JFrame {
    private JEditorPane jEditorPane;

    public _24_JEditorPaneExample(){
        setTitle("JEditorPane Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);

        getContentPane().add(new JScrollPane(getjEditorPane()), BorderLayout.CENTER);
    }

    public JEditorPane getjEditorPane() {
        if (jEditorPane == null){
            jEditorPane = new JEditorPane();
            try {
                jEditorPane.setPage(getClass().getResource("source/jeditorpane.html"));
            } catch (Exception e){}
            jEditorPane.setEditable(false);
            jEditorPane.addHyperlinkListener(new HyperlinkListener() {
                @Override
                public void hyperlinkUpdate(HyperlinkEvent e) {
                    if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED){
                        try {
                            jEditorPane.setPage(e.getURL());
                        } catch (IOException e2){}
                    }
                }
            });
        }
        return jEditorPane;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                _24_JEditorPaneExample JFrame = new _24_JEditorPaneExample();
                JFrame.setVisible(true);
            }
        });
    }
}
