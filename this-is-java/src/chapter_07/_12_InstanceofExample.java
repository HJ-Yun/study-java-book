package chapter_07;

public class _12_InstanceofExample {
    public static void method1(_12_Parent myParent){
        if (myParent instanceof _12_Child){
            _12_Child myChild = (_12_Child) myParent;
            System.out.println("method1 - Child");
        }else {
            System.out.println("method1 - Parent");
        }
    }

    public static void method2 (_12_Parent myParent){
        _12_Child myChild = (_12_Child) myParent;
        System.out.println("method2 - Child");
    }

    public static void main(String[] args) {
        _12_Parent myParentA = new _12_Child();
        method1(myParentA);
        method2(myParentA);

        _12_Parent myParentB = new _12_Parent();
        method1(myParentB);
        method2(myParentB);
    }
}
