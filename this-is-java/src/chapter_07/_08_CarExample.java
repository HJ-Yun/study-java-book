package chapter_07;

public class _08_CarExample {
    public static void main(String[] args) {
        _08_Car myCar = new _08_Car();

        myCar.tire = new _08_Tire(); //There is no Constructor
        myCar.run();

        myCar.tire = new _08_Tire_A();
        myCar.run();

        myCar.tire = new _08_Tire_B();
        myCar.run();

    }
}
