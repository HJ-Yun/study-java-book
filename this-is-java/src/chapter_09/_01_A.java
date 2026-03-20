package chapter_09;

class _01_A {
    _01_A() {
        System.out.println("A is made");
    }

    //Instance member
    class _01_B {
        _01_B() {
            System.out.println("B is made");
        }
        int field1;
        //static int field2; //Error
        void method1() {
        }
        //static void method2(){ } //Error
    }

    //Static member
    static class _01_C {
        _01_C(){
            System.out.println("C is made");
        }
        int field1;
        static int field2;
        void method1(){ }
        static void method2(){ }
    }

    //Local Class
    void method(){
        class _01_D{
            _01_D(){
                System.out.println("D is made");
            }
            int field1;
            //static int field2;
            void method1(){ }
            //static void method(){ } //Error
        }
        _01_D myD = new _01_D();
        myD.field1 = 3;
        myD.method1();
    }
}