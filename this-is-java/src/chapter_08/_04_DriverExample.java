package chapter_08;

public class _04_DriverExample {
    public static void main(String[] args) {
        _04_Driver myDrive = new _04_Driver();

        _04_Bus myBus = new _04_Bus();
        _04_Taxi myTaxi = new _04_Taxi();

        myDrive.drive(myBus);
        myDrive.drive(myTaxi);
    }
}
