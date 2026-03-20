package chapter_14;

import java.util.function.BinaryOperator;

public class _15_OperatorMinByMaxByExample {
    public static void main(String[] args) {
        BinaryOperator<_15_Fruit> binaryOperator;
        _15_Fruit fruit;

        binaryOperator = BinaryOperator.minBy(
                (f1, f2) -> Integer.compare(f1.getPrice(), f2.getPrice())
        );
        fruit = binaryOperator.apply(
                new _15_Fruit("Apple",6000),new _15_Fruit("Orange",7000)
        );
        System.out.println("Min : " + fruit.getName() + "(" + fruit.getPrice() + ")");

        binaryOperator = BinaryOperator.maxBy(
                (f1, f2) -> Integer.compare(f1.getPrice(), f2.getPrice())
        );
        fruit = binaryOperator.apply(
                new _15_Fruit("Apple", 6000), new _15_Fruit("Orange",7000)
        );
        System.out.println("Max : " + fruit.getName() + "(" + fruit.getPrice() + ")");
    }
}
