package chapter_11;

import java.util.HashMap;

public class _02_KeyExample {
    public static void main(String[] args) {
        HashMap<_02_Key, String> hashMap = new HashMap<_02_Key, String>();

        hashMap.put(new _02_Key(1), "Mark");

        String value = hashMap.get(new _02_Key(1));
        System.out.println(value);
    }
}
