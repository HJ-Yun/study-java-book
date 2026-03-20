package chapter_14;

public class _05_UsingLocalValue {

    void method(int arg){
        int localVal = 10;

        //arg = 10;      //Need to be final. can not fix.
        //localVal = 40; //Need to be final. can not fix.

        _05_MyFunctionalInterface fi = () -> {
            System.out.println("arg : " + arg);
            System.out.println("localVal : " + localVal);
        };
        fi.method();
    }
}
