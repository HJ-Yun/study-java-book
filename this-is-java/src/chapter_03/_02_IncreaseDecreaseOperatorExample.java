package chapter_03;

public class _02_IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("---------------------");
        x++; //11
        ++x; //12
        System.out.println("x = " + x);

        System.out.println("---------------------");
        y--; //9
        --y; //8
        System.out.println("y = " + y);

        System.out.println("---------------------");
        z = x++; //12
        System.out.println("z = " + z); //12
        System.out.println("x = " + x); //13

        System.out.println("---------------------");
        z = ++x; //14
        System.out.println("z = " + z); //14
        System.out.println("x = " + x); //14

        System.out.println("---------------------");
        z = ++x + y++; //x = 15, y = 8
        System.out.println("z = " + z); //z = 23
        System.out.println("x = " + x); //x = 15
        System.out.println("y = " + y); //y = 9
    }
}
