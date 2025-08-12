package chapter_07;

public class _09_CarExample {
    public static void main(String[] args) {
        _09_Car myCar = new _09_Car();

        for (int i = 0; i < 6; i++){
            int problemLocation = myCar.run();

            switch (problemLocation){
                case 1:
                    System.out.println("Front Left Tire changes to Tire_A");
                    myCar.frondLeftTire = new _09_Tire_A("FrontLeft",15);
                    break;
                case 2:
                    System.out.println("Front Right Tire changes to Tire_B");
                    myCar.frontRightTire = new _09_Tire_B("FrontRight",13);
                    break;
                case 3:
                    System.out.println("Back Left Tire changes to Tire_A");
                    myCar.backLeftTire = new _09_Tire_A("BackLeft",14);
                    break;
                case 4:
                    System.out.println("Back Right Tire changes to Tire_B");
                    myCar.backRightTire = new _09_Tire_B("BackRight",17);
                    break;
            }
            System.out.println("-----------------------------");

        }

    }
}
