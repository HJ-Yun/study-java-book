package chapter_12;

import java.awt.*;

//Print "Beep" after sound 'beep' is finished.
public class _01_BeepPrintExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++){
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e){ }
        }

        for (int i = 0; i<5; i++){
            System.out.println("Beep");
            try {
                Thread.sleep(500);
            } catch (Exception e){ }
        }
    }
}
