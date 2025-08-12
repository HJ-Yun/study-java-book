package chapter_12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class _19_NoResultExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        System.out.println("[Requesting work]");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 1; i <= 10; i++){
                    sum += i;
                }
                System.out.println("[Result] : " + sum);
            }
        };
        Future future = executorService.submit(runnable);

        try {
            future.get();
            System.out.println("[Work finished]");
        } catch (Exception e){
            System.out.println("[Exception occurred] : " + e.getMessage());
        }

        executorService.shutdown();
    }
}
