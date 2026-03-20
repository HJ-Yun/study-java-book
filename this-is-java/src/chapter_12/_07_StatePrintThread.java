package chapter_12;

public class _07_StatePrintThread extends Thread{
    private Thread targetThread;

    public _07_StatePrintThread(Thread targetThread){
        this.targetThread = targetThread;
    }

    public void run(){
        while (true){
            Thread.State state = targetThread.getState();
            System.out.println("Target thread state : " + state);

            if (state == Thread.State.NEW){
                targetThread.start();
            }

            if (state == Thread.State.TERMINATED){
                break;
            }

            try {
                Thread.sleep(500);
            } catch (Exception e){}
        }
    }
}
