package chapter_08;

public class _07_DefaultMethodExample {
    public static void main(String[] args) {
        _07_MyInterface myClassA = new _07_MyClass_A();
        myClassA.methodA();
        myClassA.methodB();
        System.out.println();

        _07_MyInterface myClassB = new _07_MyClass_B();
        myClassB.methodA();
        myClassB.methodB();

    }
}
