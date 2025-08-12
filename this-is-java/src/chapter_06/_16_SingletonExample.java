package chapter_06;

public class _16_SingletonExample {
    public static void main(String[] args) {
        // _16_Singleton obj1 = new _16_Singleton(); //Error
        // _16_Singleton obj2 = new _16_Singleton(); //Error

        _16_Singleton obj1 = _16_Singleton.getInstance();
        _16_Singleton obj2 = _16_Singleton.getInstance();

        if (obj1 == obj2){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
    }
}
