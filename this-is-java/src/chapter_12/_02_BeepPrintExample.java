package chapter_12;
//make object in main thread and run the method.
public class _02_BeepPrintExample {
    public static void main(String[] args) {
        Runnable beepTask = new _02_BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();

        for (int i = 0; i < 5; i++){
            System.out.println("Beep");
            try {
                Thread.sleep(500);
            } catch (Exception e) { }
        }
    }
}
