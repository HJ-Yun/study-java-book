package chapter_03;

public class _15_CompareOperatorExample2 {
    public static void main(String[] args) {
        int v2 = 1;
        double v3 = 1.0;
        System.out.println(v2 == v3); //ture

        double v4 = 0.1;
        float v5 = 0.1f;
        System.out.println(v4 == v5); //false
        System.out.println((float) v4 == v5); //true
        System.out.println(v4 == (double) v5); //false
        System.out.println((int) (10 * v4) == (int) (10 * v5)); //true
        System.out.println();

        System.out.println(v4); //0.1
        System.out.println((float) v4); //0.1
        System.out.println(v5); //0.1
        System.out.println((double) v5); //0.10000000149011612
        System.out.println(10 * v4); //1.0
        System.out.println(10 * v5); //1.0
    }
}