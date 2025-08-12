package chapter_12;

public class _12_ProducerThread extends Thread{
    private _12_DataBox dataBox;

    public _12_ProducerThread(_12_DataBox dataBox){
        this.dataBox = dataBox;
    }

    @Override
    public void run(){
        for (int i = 1; i <= 3; i++){
            String data = "Data - " + i;
            dataBox.setData(data);
        }
    }
}
