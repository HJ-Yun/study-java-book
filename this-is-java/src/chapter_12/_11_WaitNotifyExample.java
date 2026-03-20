package chapter_12;

public class _11_WaitNotifyExample {
    public static void main(String[] args) {
        _11_WorkObject sharedObject = new _11_WorkObject();

        _11_ThreadA threadA = new _11_ThreadA(sharedObject);
        _11_ThreadB threadB = new _11_ThreadB(sharedObject);

        threadA.start();
        threadB.start();


    }
}
