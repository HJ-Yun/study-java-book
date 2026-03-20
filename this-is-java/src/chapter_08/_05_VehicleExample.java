package chapter_08;

public class _05_VehicleExample {
    public static void main(String[] args) {
        _05_Vehicle myVehicle = new _05_Bus();

        myVehicle.run();
        //myVehicle.checkFare(); //Error

        _05_Bus myBus = new _05_Bus();
        myBus.run();
        myBus.checkFare();
    }
}
