package chapter_14;

import java.util.function.*;

public class _07_ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = t -> System.out.println(t + "8");
        consumer.accept("Java");

        BiConsumer<String,String> biConsumer = (t,u) -> System.out.println(t + u);
        biConsumer.accept("Java","8");

        DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
        doubleConsumer.accept(8.0);

        ObjIntConsumer<String> objIntConsumer = (t,i) -> System.out.println(t + i);
        objIntConsumer.accept("Java",8);
    }
}
