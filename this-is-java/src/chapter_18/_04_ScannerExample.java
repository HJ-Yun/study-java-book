package chapter_18;

import java.util.Scanner;

public class _04_ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String> ");
        String inputString = sc.nextLine();
        System.out.println(inputString);
        System.out.println();

        System.out.print("int> ");
        int inputInt = sc.nextInt();
        System.out.println(inputInt);
        System.out.println();

        System.out.print("Double> ");
        double inputDouble = sc.nextDouble();
        System.out.println(inputDouble);

    }
}
