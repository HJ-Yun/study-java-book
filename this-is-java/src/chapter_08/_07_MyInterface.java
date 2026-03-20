package chapter_08;

public interface _07_MyInterface {
    public void methodA();

    public default void methodB(){
        System.out.println("My interface - Method_B");
    }

}
