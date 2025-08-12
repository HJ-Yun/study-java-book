package chapter_12;

public class _12_ConsumerThread extends Thread{
    private _12_DataBox dataBox;

    public _12_ConsumerThread(_12_DataBox dataBox){
        this.dataBox = dataBox;
    }

    public void run(){
        for (int i = 1; i <= 3; i++){
            String data = dataBox.getData();
        }
    }
}
