package chapter_13;

public class _02_BoxExample {
    public static void main(String[] args) {
        _02_Box<String> box1 = new _02_Box<String>(); //T -> String
        box1.set("hello");
        String str = box1.get();

        _02_Box<Integer> box2 = new _02_Box<Integer>(); //T -> Integer
        box2.set(6);
        int num = box2.get();
    }
}
