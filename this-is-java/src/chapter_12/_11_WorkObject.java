package chapter_12;

public class _11_WorkObject {
    public synchronized void methodA(){
        System.out.println("methodA is working");
        notify();
        try {
            wait();
        } catch (InterruptedException e){ }
    }

    public synchronized void methodB(){
        System.out.println("methodB is working");
        notify();
        try {
            wait();
        } catch (InterruptedException e){ }
    }
}
