package chapter_12;

public class _17_WorkThread extends Thread{
    public _17_WorkThread(ThreadGroup threadGroup, String threadName){
        super(threadGroup,threadName);
    }

    public void run(){
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println(getName() + " interrupted");
                break;
            }
        }
        System.out.println(getName() + " finished");
    }
}
