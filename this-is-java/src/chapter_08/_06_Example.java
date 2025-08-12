package chapter_08;

public class _06_Example {
    public static void main(String[] args) {
        _06_ImplementationC imple_C = new _06_ImplementationC();

        _06_InterfaceA ia = imple_C;
        ia.methodA();
        //ia.methodB(); //Error
        //ia.methodC(); //Error

        _06_InterfaceB ib = imple_C;
        //ib.methodA(); //Error
        ib.methodB();
        //ib.methodC(); //Error

        _06_InterfaceC ic = imple_C;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
