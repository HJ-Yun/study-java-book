package chapter_12;

public class _14_InterruptExample {
    public static void main(String[] args) {
        _14_PrintThread2 printThread2 = new _14_PrintThread2();

        printThread2.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){ }

        printThread2.interrupt();
    }
}
