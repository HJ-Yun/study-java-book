package chapter_12;

public class _09_ThreadA extends Thread{
    public boolean stop = false;
    public boolean work = true;

    public void run(){
        while (!stop){
            if (work){
                System.out.println("ThreadA working");
            } else {
                Thread.yield();
            }
        }
        System.out.println("ThreadA finished");
    }
}
