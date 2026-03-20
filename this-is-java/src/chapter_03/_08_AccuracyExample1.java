package chapter_03;

public class _08_AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result1 = apple - pieceUnit * number; //result1 = 1 - 0.1 * 7
        System.out.println("1 - 0.7 = " + result1); // Can not get exact 0.1 (0.09999・・・)

        int pear = 1;
        int totalPieces = 10;
        int temp = totalPieces - number;

        double result2 = temp / 10.0; //result2 = 7 / 10.0
        System.out.println("1 - 0.7 = " + result2);
    }
}
