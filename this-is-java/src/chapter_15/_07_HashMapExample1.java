package chapter_15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _07_HashMapExample1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("Mark",90);
        map.put("Nick",95);
        map.put("Pual",40);
        map.put("Mark",95); //Mark Integer change 90 -> 95
        System.out.println("Entry size : " + map.size());

        System.out.println("\tNick : " + map.get("Nick"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.printf("\t%s : %d\n",key,value);
        }
        System.out.println();

        map.remove("Mark");
        System.out.println("Entry size : " + map.size());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.printf("\t%s : %d\n",key,value);
        }
        System.out.println();

        map.clear();
        System.out.println("Entry size : " + map.size());
    }
}
