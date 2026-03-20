package chapter_06;

public class _20_Car {
    private int speed; //initial value = 0
    private boolean stop; //initial value = false

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed){
        if (speed < 0){
            this.speed = 0;
            return;
        }else {
            this.speed = speed;
        }
    }
    public boolean isStop(){
        return stop;
    }
    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }
}
