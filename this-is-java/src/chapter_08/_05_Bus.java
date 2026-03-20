package chapter_08;

public class _05_Bus implements _05_Vehicle{
    @Override
    public void run(){
        System.out.println("Bus runs");
    }

    public void checkFare(){
        System.out.println("Check the fare");
    }
}
