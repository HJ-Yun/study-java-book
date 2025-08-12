package chapter_06;

public class _20_CarExample {
    public static void main(String[] args) {
        _20_Car myCar = new _20_Car();

        myCar.setSpeed(-50);
        System.out.println("Current Speed is " + myCar.getSpeed() + "km");

        myCar.setSpeed(60);
        System.out.println("Current Speed is " + myCar.getSpeed() + "km");

        if (!myCar.isStop()){
            myCar.setStop(true);
        }
        System.out.println("Current Speed is " + myCar.getSpeed() + "km");
    }
}
