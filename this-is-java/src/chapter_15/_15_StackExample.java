package chapter_15;

import java.util.Stack;

public class _15_StackExample {
    public static void main(String[] args) {
        Stack<_15_Coin> coinBox = new Stack<_15_Coin>();

        coinBox.push(new _15_Coin(100));
        coinBox.push(new _15_Coin(50));
        coinBox.push(new _15_Coin(500));
        coinBox.push(new _15_Coin(10));

        while (!coinBox.isEmpty()){
            _15_Coin coin = coinBox.pop();
            System.out.printf("Out Coin : %d\n",coin.getValue());
        }
    }
}
