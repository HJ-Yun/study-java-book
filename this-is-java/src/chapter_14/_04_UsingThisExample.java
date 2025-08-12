package chapter_14;

public class _04_UsingThisExample {
    public static void main(String[] args) {
        _04_UsingThis usingThis = new _04_UsingThis();
        _04_UsingThis.Inner inner = usingThis.new Inner();
        inner.method();
    }
}
