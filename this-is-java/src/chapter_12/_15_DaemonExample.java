package chapter_12;

public class _15_DaemonExample {
    public static void main(String[] args) {
        _15_AutoSaveThread autoSaveThread = new _15_AutoSaveThread();

        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){ }

        System.out.println("Program closed.");


    }
}
