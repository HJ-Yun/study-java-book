package chapter_08;

public class _03_Car {
    _03_Tire frontLeftTire = new _03_Tire_A();
    _03_Tire frontRightTire = new _03_Tire_A();
    _03_Tire backLeftTire = new _03_Tire_A();
    _03_Tire backRightTire = new _03_Tire_A();

    void run(){
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }

}
