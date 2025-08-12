package chapter_07;

public class _11_ChildExample {
    public static void main(String[] args) {
        _11_Parent myParent= new _11_Child();
        myParent.field1 = "ABC";
        myParent.method1();
        myParent.method2();

        //myParent.field2 = "DEF" //Error
        //myParent.method3(); //Error

        _11_Child myChild = (_11_Child) myParent;
        myChild.field2 = "AABBCC";
        myChild.method3();
    }

}
