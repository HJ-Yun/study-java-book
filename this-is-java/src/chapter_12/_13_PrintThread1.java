package chapter_12;

public class _13_PrintThread1 extends Thread{
    private boolean stop;

    public void setStop(boolean stop){
        this.stop = stop;
    }

    public void run(){
        while (!stop){
            System.out.println("On going");
        }
        System.out.println("On closing");
        System.out.println("Closed");
    }
}
