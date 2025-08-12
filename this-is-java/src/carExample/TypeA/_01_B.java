package carExample.TypeA;

public class _01_B {
    public void method(){
        _01_A a = new _01_A(); //same package can use
        a.field = "value"; //same package can use
        a.method(); //same package can use
    }
}
