package chapter_14;

import java.util.function.Function;

public class _12_FunctionAndThenComposeExample {
    public static void main(String[] args) {
        Function<_12_Member, _12_Address> functionA;
        Function<_12_Address, String> functionB;
        Function<_12_Member, String> functionAB;
        String city;

        functionA = m -> m.getAddress();
        functionB = a -> a.getCity();

        functionAB = functionA.andThen(functionB);
        city = functionAB.apply(
                new _12_Member("Mike","Hong", new _12_Address("Japan","Shiga"))
        );
        System.out.println("City : " + city);

        functionAB = functionB.compose(functionA);
        city = functionAB.apply(
                new _12_Member("Nick","Pual",new _12_Address("Korea","Seoul"))
        );
        System.out.println("City : " + city);
    }
}
