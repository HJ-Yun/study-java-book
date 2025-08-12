package chapter_07;

public class _01_CellPhone {
    String model;
    String color;

    void powerOn(){
        System.out.println("Power On");
    }
    void powerOff(){
        System.out.println("Power Off");
    }
    void bell() {
        System.out.println("Bell");
    }
    void sendVoice(String message){
        System.out.println("My Message = " + message);
    }
    void receiveVoice(String message){
        System.out.println("Receive Message = " + message);
    }
    void hangUp(){
        System.out.println("End the call");
    }
}