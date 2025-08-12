package chapter_06;

public class _10_Car {
    int speed;
    void keyTurnOn(){
        System.out.println("Start");
    }
    void run(){
        for (int i = 0; i < 60; i +=10){
            speed = i;
            System.out.println("Car Speed is " + i + "km");
        }
    }
    int getSpeed(){
        return speed;
    }
}
