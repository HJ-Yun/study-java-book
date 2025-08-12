package chapter_14;

public class _03_MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        _03_MyFunctionalInterface fi;

        fi = (x,y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(fi.method(2,5));

        fi = (x,y) -> {return x + y;};
        System.out.println(fi.method(3,5));

        fi = (x,y) -> x + y;
        System.out.println(fi.method(4,5));

        fi = (x,y) -> sum(x,y);
        System.out.println(fi.method(7,8));
    }

    public static int sum(int x, int y){
        return x + y;
    }
}
