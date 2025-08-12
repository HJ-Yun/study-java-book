package chapter_08;

public class _03_CarExample {
    public static void main(String[] args) {
        _03_Car myCar = new _03_Car();
        myCar.run();
        System.out.println();

        myCar.backRightTire = new _03_Tire_B();
        myCar.backLeftTire = new _03_Tire_B();
        myCar.run();
    }
}
