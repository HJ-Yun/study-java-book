package chapter_11;

public class _15_SystemTimeExample {
    public static void main(String[] args) {
        long time1 = System.nanoTime();

        int sum = 0;
        for (int i = 0; i < 10000; i++){
            sum += i;
        }

        long time2 = System.nanoTime();

        System.out.println("Sum from 1 to 10000 : " + sum);
        System.out.println("Time : " + (time2 - time1) + " nano second");
    }
}
