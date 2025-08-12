package chapter_07;

public class _13_PhoneExample {
    public static void main(String[] args) {
        //_13_Phone myPhone = new _13_Phone(); //Error
        _13_SmartPhone myPhone = new _13_SmartPhone("Konan");

        myPhone.turnOn();
        myPhone.internetSearch();
        myPhone.turnOff();

    }
}
