package chapter_07;

public class _04_SupersonicAirplaneExample {
    public static void main(String[] args) {
        _04_SupersonicAirplane flight = new _04_SupersonicAirplane();

        flight.takeOff();
        flight.fly();
        flight.flyMode = _04_SupersonicAirplane.SUPERSONIC;
        flight.fly();
        flight.flyMode = _04_SupersonicAirplane.NORMAL;
        flight.fly();
        flight.land();
    }
}
