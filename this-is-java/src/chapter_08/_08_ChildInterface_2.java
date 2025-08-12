package chapter_08;

public interface _08_ChildInterface_2 extends _08_ParentInterface{
    @Override
    public default void method2(){
        System.out.println("Child_2 - Method_2");
    }
    public void method3();
}
