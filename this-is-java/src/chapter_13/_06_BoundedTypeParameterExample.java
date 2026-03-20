package chapter_13;

public class _06_BoundedTypeParameterExample {
    public static void main(String[] args) {
        int result1 = _06_Util.compare(10,20);
        System.out.println(result1);

        int result2 = _06_Util.compare(3,2.5);
        System.out.println(result2);

//        String str = _06_Util.compare("a","b"); // T extends Number
//        System.out.println(str);                // -> only can number type
    }
}
