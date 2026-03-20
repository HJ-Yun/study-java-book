package chapter_12;

public class _06_MainThreadExample {
    public static void main(String[] args) {
        _06_Calculator calculator = new _06_Calculator();

        _06_User1 user1 = new _06_User1();
        user1.setCalculator(calculator);
        user1.start();

        _06_User2 user2 = new _06_User2();
        user2.setCalculator(calculator);
        user2.start();

    }
}
