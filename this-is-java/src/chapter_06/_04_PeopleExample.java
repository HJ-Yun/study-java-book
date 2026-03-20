package chapter_06;

public class _04_PeopleExample {
    public static void main(String[] args) {
        _04_People myInfo1 = new _04_People("Konan", "1234-1234");
        System.out.println("Name is " + myInfo1.name);
        System.out.println("Number is " + myInfo1.number);

        _04_People myInfo2 = new _04_People("Yun", "1234-5678");
        System.out.println("Name is " + myInfo2.name);
        System.out.println("Number is " + myInfo2.number);
    }
}
