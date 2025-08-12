package chapter_09;

public class _01_Main {
    public static void main(String[] args) {
        _01_A myA = new _01_A();

        //Instance member
        _01_A._01_B myB = myA.new _01_B();
        myB.field1 = 3;
        myB.method1();

        //static member
        _01_A._01_C myC = new _01_A._01_C();
        myC.field1 = 3;
        myC.method1();
        _01_A._01_C.field2 = 3;
        _01_A._01_C.method2();

        //Local
        myA.method();

    }
}
