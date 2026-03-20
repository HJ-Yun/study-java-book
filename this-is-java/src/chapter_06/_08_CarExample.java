package chapter_06;

public class _08_CarExample {
    public static void main(String[] args) {
        _08_Car myCar = new _08_Car();
        myCar.setGas(5);

        boolean gasState = myCar.isLeftGas();
        if (gasState) {
            System.out.println("Start the car");
            myCar.run();
        }

        if (myCar.isLeftGas()){
            System.out.println("No need to charge gas");
        }
        else {
            System.out.println("Need to charge gas");
        }
    }
}
