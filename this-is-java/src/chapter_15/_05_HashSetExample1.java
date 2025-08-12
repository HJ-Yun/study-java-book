package chapter_15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _05_HashSetExample1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java"); //"Java" add twice. -> Set will save only once.
        set.add("iBATIS");

        int size = set.size(); //size is 4.
        System.out.println("Set size : " + size);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("iBATIS");

        int sizeAfter = set.size(); //size is 2.

        System.out.println("Set size : " + sizeAfter);

        iterator = set.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.clear();
        if (set.isEmpty()){
            System.out.println("Set is empty");
        } else {
            System.out.println("Set is still remain");
        }
    }
}
