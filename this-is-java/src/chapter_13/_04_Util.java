package chapter_13;

public class _04_Util {
    public static <T> _02_Box<T> boxing(T t){
        _02_Box<T> box = new _02_Box<T>();
        box.set(t);
        return box;
    }
}
