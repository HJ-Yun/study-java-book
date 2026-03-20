package chapter_09;

public class _08_AnonymousExample {
    public static void main(String[] args) {
        _08_Anonymous myAnonymous = new _08_Anonymous();

        myAnonymous.myRemoteControl.turnOn();
        myAnonymous.method1();
        myAnonymous.method2(
                new _08_RemoteControl() {
                    @Override
                    public void turnOn(){
                        System.out.println("Turn on the Smart TV");
                    }
                    @Override
                    public void turnOff(){
                        System.out.println("Turn off the Smart TV");
                    }
                }
        );
    }
}
