package chapter_12;

public class _12_DataBox {
    private String data;

    public synchronized void setData(String data){
        if (this.data != null){
            try {
                wait();
            } catch (InterruptedException e){}
        }
        this.data = data;
        System.out.println("Producer Thread : " + data);
        notify();
    }

    public synchronized String getData(){
        if (this.data == null){
            try {
                wait();
            } catch (InterruptedException e){ }
        }
        String returnVal = data;
        System.out.println("Consumer Thread : " + returnVal);
        data = null;
        notify();
        return returnVal;
    }
}
