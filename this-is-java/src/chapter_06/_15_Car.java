package chapter_06;

public class _15_Car {
    int speed;

    void run(){
        System.out.println(speed);
    }

    public static void main(String[] args) {
        _15_Car myCar = new _15_Car();
        myCar.speed = 60;
        myCar.run();
    }
}
