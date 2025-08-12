package chapter_08;

public interface _01_RemoteControl {
    //Constant Field
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    //Abstract Method
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    //Default Method
    default void setMute(boolean mute){
        if (mute){
            System.out.println("Mute");
        }else {
            System.out.println("Mute Off");
        }
    }

    //Static Method
    static void changeBattery(){
        System.out.println("Change the Battery");
    }
}
