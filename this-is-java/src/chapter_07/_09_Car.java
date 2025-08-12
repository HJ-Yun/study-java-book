package chapter_07;

public class _09_Car {
    //Field
    _09_Tire frondLeftTire = new _09_Tire("FrontLeft",6);
    _09_Tire frontRightTire = new _09_Tire("FrontRight",2);
    _09_Tire backLeftTire = new _09_Tire("BackLeft",3);
    _09_Tire backRightTire = new _09_Tire("BackRight",4);

    //Constructor
    //Method
    int run(){
        System.out.println("Car runs");
        if (frondLeftTire.roll() == false){
            stop();
            return 1;
        }
        if (frontRightTire.roll() == false){
            stop();
            return 2;
        }
        if (backLeftTire.roll() == false){
            stop();
            return 3;
        }
        if (backRightTire.roll() == false){
            stop();
            return 4;
        }
        return 0;
    }

    void stop(){
        System.out.println("Car Stops");
    }
}
