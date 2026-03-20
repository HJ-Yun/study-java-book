package chapter_12;

public class _03_BeepPrintExample {
    public static void main(String[] args) {
        Thread thread = new _03_BeepThread();
        thread.start();

        for (int i = 0; i < 5; i++){
            System.out.println("Beep");
            try {
                Thread.sleep(500);
            } catch (Exception e) { }
        }
    }
}
