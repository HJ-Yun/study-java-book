package chapter_11;

public class _04_SmartPhoneExample {
    public static void main(String[] args) {
        _04_SmartPhone myPhone = new _04_SmartPhone("Google", "Android");

        String strObj = myPhone.toString();
        System.out.println(strObj);

        System.out.println(myPhone);
    }
}
