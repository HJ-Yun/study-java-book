package chapter_06;

public class _17_PersonExample {
    public static void main(String[] args) {
        _17_Person p1 = new _17_Person("1234-1234", "Hanako");

        System.out.println(p1.nation);
        System.out.println(p1.number);
        System.out.println(p1.name);

        //p1.nation = "usa"; //Error
        //p1.number = "1233-1576"; //Error
        p1.name = "Tomo";
        System.out.println(p1.name);
    }
}
