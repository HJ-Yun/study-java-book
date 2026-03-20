package chapter_12;

public class _11_ThreadB extends Thread{
    private _11_WorkObject workObject;

    public _11_ThreadB(_11_WorkObject workObject){
        this.workObject = workObject;
    }

    public void run(){
        for (int i = 0; i < 10; i++){
            workObject.methodB();
        }
    }
}
