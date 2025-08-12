package chapter_07;

public class _10_DriverExample {
    public static void main(String[] args) {
        _10_Driver myDrive = new _10_Driver();

        _10_Vehicle myVehicle = new _10_Vehicle();
        _10_Bus myBus = new _10_Bus();
        _10_Taxi myTaxi = new _10_Taxi();

        myDrive.drive(myVehicle);
        myDrive.drive(myBus);
        myDrive.drive(myTaxi);

    }
}
