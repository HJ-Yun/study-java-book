package chapter_14;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _18_ConstructorReferencesExample {
    public static void main(String[] args) {
        Function<String, _18_Member> function1 = _18_Member :: new;
        _18_Member member1 = function1.apply("angel");

        BiFunction<String, String, _18_Member> function2 = _18_Member::new;
        _18_Member member2 = function2.apply("angel","devil");
    }
}
