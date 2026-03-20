package chapter_14;

public class _02_MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        _02_MyFunctionalInterface fi;

        fi = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(5);

        fi = (x) -> {
            System.out.println(x * 5);
        };
        fi.method(6);

        fi = x -> System.out.println(x * 5);
        fi.method(7);
    }
}
