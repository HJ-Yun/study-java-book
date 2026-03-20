package chapter_07;

public class _07_ChildExample {
    public static void main(String[] args) {
        _07_Child child = new _07_Child();

        _07_Parent parent = child;
        parent.method1();
        parent.method2();
        //parent.method3(); //Error ---> This is from _07_Child
    }
}
