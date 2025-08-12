package chapter_09;

public class _07_Anonymous {
    _07_Person myPerson = new _07_Person(){
        void work(){
            System.out.println("Go to work");
        }
        @Override
        void wake(){
            System.out.println("Wake up at 6");
            work();
        }
    };

    void method1(){
        _07_Person localPerson = new _07_Person(){
            void walk(){
                System.out.println("Go to walk");
            }
            @Override
            void wake(){
                System.out.println("Wake up at 7");
                walk();
            }
        };
        localPerson.wake();
    }
    void method2(_07_Person myPerson2){
        myPerson2.wake();
    }
}
