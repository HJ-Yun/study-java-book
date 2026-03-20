package chapter_03;

public class _04_OverflowExample {
    public static void main(String[] args) {
        int x = 1000000;
        int y = 1000000;
        int z = x * y;
        System.out.println(z); // Overflow (-727379968)

        long a = 1000000;
        long b = 1000000; // or int
        long c = a * b;
        System.out.println(c);
    }
}
