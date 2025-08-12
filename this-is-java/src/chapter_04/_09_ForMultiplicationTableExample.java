package chapter_04;

public class _09_ForMultiplicationTableExample {
    public static void main(String[] args) {
        int i, j;

        for (i = 2; i < 10; i++){
            System.out.println("****" + i + "****");
            for (j = 1; j < 10; j++){
                System.out.println(i + " x " + j + "= " + i*j);
            }
            System.out.println();
        }
    }
}
