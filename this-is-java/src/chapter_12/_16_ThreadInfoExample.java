package chapter_12;

import java.util.Map;
import java.util.Set;

public class _16_ThreadInfoExample {
    public static void main(String[] args) {
        _15_AutoSaveThread autoSaveThread = new _15_AutoSaveThread();
        autoSaveThread.setName("AutoSaveThread");

        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        Map<Thread, StackTraceElement[]>map = Thread.getAllStackTraces();
        Set<Thread> threads = map.keySet();
        for (Thread thread : threads){
            System.out.println("Name : " + thread.getName() +
                    ((thread.isDaemon())? "(Daemon)" : "(Main)"));
            System.out.println("\t" + "Group : " + thread.getThreadGroup().getName());
            System.out.println();
        }
    }
}
