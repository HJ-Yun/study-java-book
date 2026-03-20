package chapter_06;

public class _08_Car {
    int gas;

    void setGas (int gas) {
        this.gas = gas;
    }

    boolean isLeftGas(){
        if (gas == 0){
            System.out.println("There is no gas");
            return false;
        }
        System.out.println("There is gas");
        return true;
    }

    void run(){
        while (true){
            if (gas > 0){
                System.out.println("Run.(Gas left : " + gas + ")");
                gas -= 1;
            }else {
                System.out.println("Stop.(Gas left : " + gas + ")");
                return;
            }
        }
    }
}
