package chapter_12;

public class _06_User2 extends Thread{
    private _06_Calculator calculator;
    public void setCalculator(_06_Calculator calculator){
        this.setName("User2");
        this.calculator = calculator;
    }
    public void run(){
        calculator.setMemory(50);
    }
}
