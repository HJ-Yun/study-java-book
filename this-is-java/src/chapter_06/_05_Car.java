package chapter_06;

public class _05_Car {
    String company = "Honda";
    String model;
    String color;
    int maxSpeed;

    _05_Car(){

    }
    _05_Car(String model){
        this.model = model;

    }
    _05_Car(String model, String color){
        this.model = model;
        this.color = color;
    }
    _05_Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
