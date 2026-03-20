package chapter_18;

import java.io.Console;

public class _03_ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.print("ID : ");
        String id = console.readLine();

        System.out.print("Password : ");
        char[] charPass = console.readPassword();
        String strPass = new String(charPass);

        System.out.println("--------------");
        System.out.println(id);
        System.out.println(strPass);
    }
}
