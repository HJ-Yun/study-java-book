package chapter_13;

public class _05_Util {
    public static <K,V> boolean compare(_05_Pair<K,V> p1, _05_Pair<K,V> p2){
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());

        return keyCompare && valueCompare;
    }
}
