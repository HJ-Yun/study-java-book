package chapter_08;

public class _01_Television implements _01_RemoteControl{
    //Field
    private int volume;

    public void turnOn(){
        System.out.println("Turn on the television");
    }
    public void turnOff(){
        System.out.println("Turn off the television");
    }
    public void setVolume(int volume){
        if (volume > _01_RemoteControl.MAX_VOLUME){
            this.volume = _01_RemoteControl.MAX_VOLUME;
        } else if (volume < _01_RemoteControl.MIN_VOLUME) {
            this.volume = _01_RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Current Television Volume is " + this.volume);
    }
}
