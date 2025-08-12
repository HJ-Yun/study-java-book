package chapter_15;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class _12_TreeMapExample3 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

        treeMap.put("apple",new Integer(10));
        treeMap.put("forever",new Integer(60));
        treeMap.put("description",new Integer(40));
        treeMap.put("ever",new Integer(50));
        treeMap.put("zoo",new Integer(10));
        treeMap.put("base",new Integer(20));
        treeMap.put("guess",new Integer(70));
        treeMap.put("cherry",new Integer(30));

        System.out.println("Searching between [c-f]");
        NavigableMap<String, Integer> rangeMap = treeMap.subMap("c",true,"f",true);
        //c <= rangeMap <= f
        for (Map.Entry<String, Integer> entry : rangeMap.entrySet()){
            System.out.printf("%s-%d\n",entry.getKey(),entry.getValue());
        }
    }
}
