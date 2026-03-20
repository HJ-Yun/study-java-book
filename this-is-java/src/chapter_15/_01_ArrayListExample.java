package chapter_15;

import java.util.ArrayList;
import java.util.List;

public class _01_ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Java"); //index : 0
        list.add("JDBC"); //index : 1
        list.add("Servlet/JSP"); //index : 2 -> 3
        list.add(2, "Database"); //index : 2
        list.add("iBATIS"); //index : 4

        int size = list.size(); //size : 5
        System.out.println("List size : " + size);

        String skill = list.get(2); // Database
        System.out.println("List (2) : " + skill);
        System.out.println();

        for (int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(i + " : " + str);
        }

        list.remove(2); //delete "Database"  //"Servlet/JSP" index 3 -> 2, "iBATIS" index 4 -> 3
        list.remove(2); //delete "Servlet/JSP" //"iBATIS" index 3 ->2
        list.remove("iBATIS");
        System.out.println();

        for (int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(i + " : " + str);
        }
    }
}
