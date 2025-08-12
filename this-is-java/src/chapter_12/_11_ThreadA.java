package chapter_12;

public class _11_ThreadA extends Thread{
    private _11_WorkObject workObject;

    public _11_ThreadA(_11_WorkObject workObject){
        this.workObject = workObject;
    }

    public void run(){
        for (int i = 0; i <10; i++){
            workObject.methodA();
        }
    }
}
