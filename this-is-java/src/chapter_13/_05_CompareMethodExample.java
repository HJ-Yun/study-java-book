package chapter_13;

public class _05_CompareMethodExample {
    public static void main(String[] args) {
        _05_Pair<Integer,String> p1 = new _05_Pair<>(1,"apple");
        _05_Pair<Integer,String> p2 = new _05_Pair<>(2,"apple");

        boolean result1 = _05_Util.<Integer,String>compare(p1,p2);

        if (result1){
            System.out.println("result1 : Same contents");
        } else {
            System.out.println("result1 : Different contents");
        }

        _05_Pair<String,String> p3 = new _05_Pair<>("Mark","Nick");
        _05_Pair<String,String> p4 = new _05_Pair<>("Mark","Nick");

        boolean result2 = _05_Util.compare(p3,p4);

        if (result2){
            System.out.println("result2 : Same contents");
        } else {
            System.out.println("result2 : Different contents");
        }
    }
}
