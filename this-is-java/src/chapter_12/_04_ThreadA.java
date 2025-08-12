package chapter_12;

public class _04_ThreadA extends Thread{
    public _04_ThreadA(){
        setName("ThreadA");
    }

    public void run(){
        for (int i = 0; i < 2; i++){
            System.out.println(getName() + " is printing.");
        }
    }
}
