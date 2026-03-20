package chapter_12;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _23_CallbackExample {
    private ExecutorService executorService;

    public _23_CallbackExample(){
        executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    }

    private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {
        @Override
        public void completed(Integer result, Void attachment) {
            System.out.println("Complete : " + result);
        }

        @Override
        public void failed(Throwable exc, Void attachment) {
            System.out.println("failed : " + exc.toString());
        }
    };

    public void doWork(final String x, final String y){
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    int intX = Integer.parseInt(x);
                    int intY = Integer.parseInt(y);
                    int result = intX + intY;
                    callback.completed(result,null);
                } catch (Exception e){
                    callback.failed(e,null);
                }
            }
        };
        executorService.submit(task);
    }

    public void finish(){
        executorService.shutdown();
    }

    public static void main(String[] args) {
        _23_CallbackExample example = new _23_CallbackExample();
        example.doWork("3","3");
        example.doWork("3","three");
        example.finish();
    }
}
