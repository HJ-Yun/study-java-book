package chapter_09;

public class _08_Anonymous{
    _08_RemoteControl myRemoteControl = new _08_RemoteControl() {
        @Override
        public void turnOn(){
            System.out.println("Turn on the TV");
        }
        @Override
        public void turnOff(){
            System.out.println("Turn off the TV");
        }
    };

    void method1(){
        _08_RemoteControl localRemoteControl = new _08_RemoteControl() {
            @Override
            public void turnOn(){
                System.out.println("turn on the Audio");
            }
            @Override
            public void turnOff(){
                System.out.println("Turn off the Audio");
            }
        };
        localRemoteControl.turnOn();
    }

    void method2(_08_RemoteControl rc){
        rc.turnOn();
    }
}
