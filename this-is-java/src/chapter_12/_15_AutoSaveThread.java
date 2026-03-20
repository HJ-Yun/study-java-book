package chapter_12;

public class _15_AutoSaveThread extends Thread{
    public void save(){
        System.out.println("Contents saved");
    }

    public void run(){
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            save();
        }
    }
}
