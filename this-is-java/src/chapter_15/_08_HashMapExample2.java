package chapter_15;

import java.util.HashMap;
import java.util.Map;

public class _08_HashMapExample2 {
    public static void main(String[] args) {
        Map<_08_Student, Integer> map = new HashMap<_08_Student, Integer>();

        map.put(new _08_Student(1,"Mark"),95);
        map.put(new _08_Student(1,"Mark"),95);

        System.out.println("Entry size : " + map.size());
    }
}
