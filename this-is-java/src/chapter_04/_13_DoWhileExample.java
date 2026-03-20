package chapter_04;

import java.util.Scanner;
public class _13_DoWhileExample {
    public static void main(String[] args) {
        System.out.println("Enter the massage");
        System.out.println("If you want to quit, please enter the [Q]");

        Scanner scanner = new Scanner(System.in);
        String inputString;

        do {
            System.out.print(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while (!inputString.equals("Q"));

        System.out.println();
        System.out.println("Quit the Program");
    }
}
