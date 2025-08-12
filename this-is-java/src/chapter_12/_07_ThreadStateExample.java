package chapter_12;

public class _07_ThreadStateExample {
    public static void main(String[] args) {
        _07_StatePrintThread statePrintThread
                = new _07_StatePrintThread(new _07_TargetThread());
        statePrintThread.start();
    }
}
