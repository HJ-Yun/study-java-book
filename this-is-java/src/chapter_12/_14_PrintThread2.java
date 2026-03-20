package chapter_12;

public class _14_PrintThread2 extends Thread{
    public void run(){
        try {
            while (true){
                System.out.println("On going");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){ }

//        while (true){
//            System.out.println("On going");
//            if (Thread.interrupted()){
//                break;
//            }
//        }

        System.out.println("On closing");
        System.out.println("Closed");
    }
}
