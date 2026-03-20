package chapter_06;

public class _10_CarExample {
    public static void main(String[] args) {
        _10_Car myCar = new _10_Car();
        myCar.keyTurnOn();
        myCar.run();
        int speed = myCar.getSpeed();
        System.out.println("Current Speed is " + speed + "km");
    }
}
