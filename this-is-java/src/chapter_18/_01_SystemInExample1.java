package chapter_18;

import java.io.InputStream;

public class _01_SystemInExample1 {
    public static void main(String[] args) throws Exception{
        System.out.println("--Menu--");
        System.out.println("1. Check");
        System.out.println("2. Cash Out");
        System.out.println("3. Cash In");
        System.out.println("4. Close");
        System.out.print("Please choose the menu : ");

        InputStream is = System.in;
        char inputChat = (char) is.read();

        switch (inputChat){
            case '1':
                System.out.println("Choose 1");
                break;
            case '2':
                System.out.println("Choose 2");
                break;
            case '3':
                System.out.println("Choose 3");
                break;
            case '4':
                System.out.println("Choose 4");
                break;
        }
    }
}
