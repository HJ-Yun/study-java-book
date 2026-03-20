package chapter_07;

public class _05_Car {
    public int speed;

    public void speedUp(){
        speed += 1;
    }

    public final void stop(){
        System.out.println("Stop the car");
        speed = 0;
    }
}
