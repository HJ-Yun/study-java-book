package chapter_12;

public class _09_ThreadB extends Thread{
    public boolean stop = false;
    public boolean work = true;

    public void run(){
        while (!stop){
            if (work){
                System.out.println("ThreadB working");
            } else {
                Thread.yield();
            }
        }
        System.out.println("ThreadB finished");
    }
}
