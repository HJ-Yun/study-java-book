package chapter_07;

public class _01_SmartPhone extends _01_CellPhone{
    int channel;

    _01_SmartPhone(String model, String color, int channel){
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnVideo(){
        System.out.println("Turn on the channel No. " + channel);
    }
    void changeChannel(int channel){
        this.channel = channel;
        System.out.println("Change the channel No. " + channel);
    }
    void turnOffVideo(){
        System.out.println("Tunr off the channel");
    }
}
