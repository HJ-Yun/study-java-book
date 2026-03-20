package chapter_09;

public class _02_A {
    class _02_B{} //Instance member class
    static class _02_C{} //Static member class

    //Instance field
    _02_B myB = new _02_B();
    _02_C myC = new _02_C();

    //Instance method
    void method(){
        _02_B var1 = new _02_B();
        _02_C var2 = new _02_C();
    }

    //Static field
    //static _02_B myBB = new _02_B(); //Error
    static _02_C myCC = new _02_C();

    //Static method
    static void method2(){
        //_02_B var3 = new _02_B(); //Error
        _02_C var4 = new _02_C();
    }
}
