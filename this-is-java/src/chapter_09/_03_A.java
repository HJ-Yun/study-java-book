package chapter_09;

public class _03_A {
    int field1;
    void method1(){ }

    static int field2;
    static void method2(){ }

    class _03_B{
        void method(){
            field1 = 10;
            method1();

            field2 = 10;
            method2();
        }
    }
    static class _03_C{
        void method(){
            //field1 = 10; //Error
            //method1(); //Error

            field2 = 10;
            method2();
        }
    }
}
