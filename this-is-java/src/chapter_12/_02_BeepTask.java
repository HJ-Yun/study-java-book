package chapter_12;

import java.awt.*;

public class _02_BeepTask implements Runnable{
    public void run(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++){
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e){ }
        }
    }


}
