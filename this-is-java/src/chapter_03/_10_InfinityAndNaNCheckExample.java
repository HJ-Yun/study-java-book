package chapter_03;

public class _10_InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;

        double z = x / y; // <--- Infinity
        //double z = x % y; // <--- NaN(Not a Number)

        System.out.println(Double.isInfinite(z)); // Checking Infinity or not
        System.out.println(Double.isNaN(z)); // Checking NaN or not

        System.out.println(z+2); // Infinity + 2 = Infinity
    }
}
