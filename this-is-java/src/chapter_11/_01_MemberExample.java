package chapter_11;

public class _01_MemberExample {
    public static void main(String[] args) {
        _01_Member obj1 = new _01_Member("blue");
        _01_Member obj2 = new _01_Member("blue");
        _01_Member obj3 = new _01_Member("red");

        if (obj1.equals(obj2)){
            System.out.println("obj1 is equal with obj2");
        } else {
            System.out.println("obj1 is not equal with obj2");
        }

        if (obj1.equals(obj3)){
            System.out.println("obj2 is equal with obj3");
        } else {
            System.out.println("obj2 is not equal with obj3");
        }
    }
}
