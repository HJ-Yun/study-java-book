package chapter_08;

public class _02_SmartTelevision implements _01_RemoteControl, _01_Searchable{
    private int volume;

    //_01_RemoteControl
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
        System.out.println("Current Volume is " + this.volume);
    }

    //_01_Searchable
    public void search(String url){
        System.out.println("Searching the " + url);
    }

}
