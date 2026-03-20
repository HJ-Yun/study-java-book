package chapter_12;

public class _10_JoinExample {
    public static void main(String[] args) {
        _10_SumThread sumThread = new _10_SumThread();

        sumThread.start();

        try {
            sumThread.join(); // Waiting until SumThread is finished.
        } catch (InterruptedException e){ }

        System.out.println("Sum result = " + sumThread.getSum());
    }
}
