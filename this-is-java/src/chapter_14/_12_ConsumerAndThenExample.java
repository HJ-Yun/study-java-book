package chapter_14;

import java.util.function.Consumer;

public class _12_ConsumerAndThenExample {
    public static void main(String[] args) {
        Consumer<_12_Member> consumerA = m -> {
            System.out.println("consumerA : " + m.getName());
        };

        Consumer<_12_Member> consumerB = m -> {
            System.out.println("consumerB : " + m.getId());
        };

        Consumer<_12_Member> consumerAB = consumerA.andThen(consumerB);

        consumerAB.accept(new _12_Member("Mark","Nick",null));
    }
}
