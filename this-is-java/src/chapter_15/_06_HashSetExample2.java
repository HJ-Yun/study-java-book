package chapter_15;

import java.util.HashSet;
import java.util.Set;

public class _06_HashSetExample2 {
    public static void main(String[] args) {
        Set<_06_Member> set = new HashSet<_06_Member>();

        set.add(new _06_Member("Mark",30));
        set.add(new _06_Member("Mark",30));

        System.out.println("Set size : " + set.size());
    }
}
