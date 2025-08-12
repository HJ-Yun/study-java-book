package chapter_14;

public class _06_RunnableExample {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++){
                System.out.println(i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

//        Thread thread1 = new Thread(() -> {
//            for (int i = 0; i < 10; i++){
//                System.out.println(i*2);
//            }
//        });
//        thread1.start();
    }
}
