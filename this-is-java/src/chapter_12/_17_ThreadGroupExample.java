package chapter_12;

public class _17_ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup myGroup = new ThreadGroup("myGroup");
        _17_WorkThread workThreadA = new _17_WorkThread(myGroup,"workThreadA");
        _17_WorkThread workThreadB = new _17_WorkThread(myGroup,"workThreadB");

        workThreadA.start();
        workThreadB.start();

        System.out.println("Main thread group list()");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();
        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){ }

        System.out.println("[myGroup thread interrupt() method]");
        myGroup.interrupt();
    }


}
