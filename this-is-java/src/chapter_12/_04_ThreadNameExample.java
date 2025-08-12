package chapter_12;

public class _04_ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Current Thread name : " + mainThread.getName());

        _04_ThreadA threadA = new _04_ThreadA();
        System.out.println("ThreadA : " + threadA.getName());
        threadA.start();

        _04_ThreadB threadB = new _04_ThreadB();
        System.out.println("ThreadB : " + threadB.getName());
        threadB.start();
    }
}
