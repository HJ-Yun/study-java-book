package chapter_12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class _18_ExecuteExample {
    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++){
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;

                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("[total thread : " + poolSize + "] Thread name : " + threadName);

                    int value = Integer.parseInt("ABC");
                }
            };

            //executorService.execute(runnable); //When Exception occurred thread is finished.
            executorService.submit(runnable); //When Exception occurred thread is not finished.

            Thread.sleep(10);
        }

        executorService.shutdown();
    }
}
