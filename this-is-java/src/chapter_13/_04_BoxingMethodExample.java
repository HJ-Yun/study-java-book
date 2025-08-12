package chapter_13;

public class _04_BoxingMethodExample {
    public static void main(String[] args) {
        _02_Box<Integer> box1 = _04_Util.<Integer>boxing(100);
        int intValue = box1.get();

        _02_Box<Integer> box2 = _04_Util.boxing(1000);
        int intValue1 = box2.get();

        _02_Box<String> box3 = _04_Util.<String>boxing("Mark");
        String strValue = box3.get();

        _02_Box<String> box4 = _04_Util.boxing("Nick");
        String strValue1 = box4.get();
    }
}
