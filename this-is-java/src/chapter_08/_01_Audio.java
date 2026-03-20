package chapter_08;

public class _01_Audio implements _01_RemoteControl{
    //Field
    private int volume;
    private boolean mute;

    public void turnOn(){
        System.out.println("Turn on the audio");
    }
    public void turnOff(){
        System.out.println("Turn off the audio");
    }
    public void setVolume(int volume){
        if (volume > _01_RemoteControl.MAX_VOLUME){
            this.volume = _01_RemoteControl.MAX_VOLUME;
        } else if (volume < _01_RemoteControl.MIN_VOLUME) {
            this.volume = _01_RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Current Audio Volume is " + this.volume);
    }

    @Override
    public void setMute(boolean mute){
        this.mute = mute;
        if (mute){
            System.out.println("Audio mute");
        }else{
            System.out.println("Audio mute off");
        }
    }
}
