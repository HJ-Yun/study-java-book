package chapter_11;

public class _05_MemberExample {
    public static void main(String[] args) {
        _05_Member original = new _05_Member("blue","Mark", "12345", 25, true);

        _05_Member cloned = original.getMember();
        cloned.password = "45678";

        System.out.println("Original value");
        System.out.println("id : " + original.id);
        System.out.println("name : " + original.name);
        System.out.println("password : " + original.password);
        System.out.println("age : " + original.age);
        System.out.println("adult : " + original.adult);
        System.out.println();

        System.out.println("Clone value");
        System.out.println("id : " + cloned.id);
        System.out.println("name : " + cloned.name);
        System.out.println("password : " + cloned.password);
        System.out.println("age : " + cloned.age);
        System.out.println("adult : " + cloned.adult);

    }
}
