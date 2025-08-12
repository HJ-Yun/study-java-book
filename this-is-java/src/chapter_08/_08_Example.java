package chapter_08;

public class _08_Example {
    public static void main(String[] args) {
        _08_Child_1 myChild1 = new _08_Child_1();
        myChild1.method1();
        myChild1.method2();
        myChild1.method3();
        System.out.println();

        _08_Child_2 myChild2 = new _08_Child_2();
        myChild2.method1();
        myChild2.method2();
        myChild2.method3();
        System.out.println();

        _08_Child_3 myChild3 = new _08_Child_3();
        myChild3.method1();
        myChild3.method2();
        myChild3.method3();

    }
}

