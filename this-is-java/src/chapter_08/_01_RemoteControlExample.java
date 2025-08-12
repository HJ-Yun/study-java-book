package chapter_08;

public class _01_RemoteControlExample {
    public static void main(String[] args) {
        _01_RemoteControl rc = null;

        rc = new _01_Television();
        rc.turnOn();
        rc.turnOff();
        rc.setMute(true);
        rc.setMute(false);
        System.out.println();

        rc = new _01_Audio();
        rc.turnOn();
        rc.turnOff();
        rc.setMute(true);
        rc.setMute(false);
        System.out.println();

        _01_RemoteControl.changeBattery();


    }
}
