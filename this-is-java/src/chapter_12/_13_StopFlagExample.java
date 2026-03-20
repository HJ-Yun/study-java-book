package chapter_12;

public class _13_StopFlagExample {
    public static void main(String[] args) {
        _13_PrintThread1 printThread1 = new _13_PrintThread1();

        printThread1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){ }

        printThread1.setStop(true);
    }
}
