package chapter_10;
public class _11_ThrowExample {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e){
            System.out.println("There is no Class");
        }
    }
    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}
