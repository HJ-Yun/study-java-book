package chapter_03;

public class _09_InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        int a = 1;
        double b = 0.25;
        System.out.println(b); //0.1
        int c = 7;
        System.out.println(c); //7

        double d = b * c;
        System.out.println(d); //0.70000000001

        double e = a - d;
        System.out.println(e);
    }
}
