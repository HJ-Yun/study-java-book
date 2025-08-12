package chapter_06;

public class _12_Car {
    String model;
    int speed;

    _12_Car(String model){
        this.model = model;
    }
    void run(){
        for (int i = 0; i < 60; i += 10){
            this.setSpeed(i);
            System.out.println(this.model + " car runs " + this.speed + "km");
        }
    }
    void setSpeed(int speed){
        this.speed = speed;
    }
}
