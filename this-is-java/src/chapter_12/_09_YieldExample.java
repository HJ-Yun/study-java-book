package chapter_12;

public class _09_YieldExample {
    public static void main(String[] args) {
        _09_ThreadA threadA = new _09_ThreadA();
        _09_ThreadB threadB = new _09_ThreadB();

        threadA.start();
        threadB.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){ }

        threadA.work = false;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){ }

        threadA.work = true;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){ }

        threadA.stop = true;
        threadB.stop = true;
    }
}
