package chapter_09;

public class _07_AnonymousExample {
    public static void main(String[] args) {
        _07_Anonymous myAnonymous = new _07_Anonymous();

        myAnonymous.myPerson.wake();
        myAnonymous.method1();
        myAnonymous.method2(
                new _07_Person(){
                    void study(){
                        System.out.println("Study");
                    }
                    @Override
                    void wake(){
                        System.out.println("Wake up at 8");
                        study();
                    }
                }
        );
    }
}