package chapter_06;

public class _02_CarExample {
    public static void main(String[] args) {
        _02_Car myCar = new _02_Car();

        System.out.println("Maker is " + myCar.company);
        System.out.println("Model is " + myCar.model1);
        System.out.println("Color is " + myCar.color);
        System.out.println("Max Speed is " + myCar.maxSpeed);
        System.out.println("Current Speed is " + myCar.speed);

        myCar.speed = 60;
        System.out.println("Current Speed is " + myCar.speed);
    }
}
