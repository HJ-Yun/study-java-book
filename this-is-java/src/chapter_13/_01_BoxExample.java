package chapter_13;

public class _01_BoxExample {
    public static void main(String[] args) {
        _01_Box box = new _01_Box();
        box.set("Mark"); //String -> Object
        String name = (String) box.get(); //Object -> String

        box.set(new _01_Apple()); //Apple -> Object
        _01_Apple apple = (_01_Apple) box.get(); //Object -> Apple
    }
}
