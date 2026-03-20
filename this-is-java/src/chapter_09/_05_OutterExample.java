package chapter_09;

public class _05_OutterExample {
    public static void main(String[] args) {
        _05_Outter myOutter = new _05_Outter();
        _05_Outter.Nested myNested = myOutter.new Nested();

        myNested.print();
    }
}
