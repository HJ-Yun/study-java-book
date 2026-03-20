package chapter_06;

public class _16_Singleton {
    private static _16_Singleton singleton = new _16_Singleton();
    private _16_Singleton(){
    }
    static _16_Singleton getInstance(){
        return singleton;
    }
}
