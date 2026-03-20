package chapter_08;

public interface _08_ParentInterface {
    public void method1();
    public default void method2(){
        System.out.println("Parent - Method_2");
    }
}
