package chapter_15;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class _09_HashtableExample {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<String, String>();

        map.put("spring","12");
        map.put("summer","123");
        map.put("fall","1234");
        map.put("winter","12345");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Put in the ID and Password");
            System.out.print("ID : ");
            String id = scanner.nextLine();

            System.out.print("Password : ");
            String pw = scanner.nextLine();
            System.out.println();

            if (map.containsKey(id)){
                if (map.get(id).equals(pw)){
                    System.out.println("Login Ok");
                    break;
                } else {
                    System.out.println("Password Wrong");
                }
            } else {
                System.out.println("ID Wrong");
            }
        }
    }
}
