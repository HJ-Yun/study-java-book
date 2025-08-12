package chapter_09;

public class _04_Outter {
    //Before Java 7
    public void method1(final int arg) {
        final int localVariable = 1;
        //arg = 100;
        //localVariable = 100;
        class Inner{
            public void method(){
                int result = arg + localVariable;
            }
        }
    }

    //After Java 8
    public void method2(int arg){ //(final)
        int localVariable = 1; //(final)
        //arg = 100;
        //localVariable = 100;
        class Inner {
            public void method(){
                int result = arg + localVariable;
            }
        }
    }
}
