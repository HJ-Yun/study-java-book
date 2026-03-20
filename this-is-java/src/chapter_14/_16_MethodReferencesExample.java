package chapter_14;

import java.util.function.IntBinaryOperator;

public class _16_MethodReferencesExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        //Static Method_1
        operator = (x,y) -> _16_Calculator.staticMethod(x,y);
        System.out.println("2 + 3 = " + operator.applyAsInt(2,3));

        //Static Method_2
        operator = _16_Calculator :: staticMethod;
        System.out.println("2 + 3 = " + operator.applyAsInt(2,3));

        //Instance Method_1
        _16_Calculator obj = new _16_Calculator();
        operator = (x,y) -> obj.instanceMethod(x,y);
        System.out.println("2 + 3 = " + operator.applyAsInt(2,3));

        operator = obj :: instanceMethod;
        System.out.println("2 + 3 = " + operator.applyAsInt(2,3));
    }
}
