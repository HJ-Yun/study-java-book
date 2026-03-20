package chapter_07;

public class _01_SmartPhoneExample {
    public static void main(String[] args) {
        _01_SmartPhone myPhone = new _01_SmartPhone("Samsung", "Black", 10);

        System.out.println(myPhone.model);
        System.out.println(myPhone.color);
        System.out.println(myPhone.channel);
        System.out.println();

        myPhone.powerOn();
        myPhone.bell();
        myPhone.sendVoice("Hello?");
        myPhone.receiveVoice("Hi. There.");
        myPhone.hangUp();
        System.out.println();

        myPhone.turnOnVideo();
        myPhone.changeChannel(12);
        myPhone.turnOffVideo();

    }
}
