package chapter_11;

public class _06_MemberExample {
    public static void main(String[] args) {
        _06_Member original = new _06_Member("Mark",25, new int[] {90, 90}, new _06_Car("Tesla"));

        _06_Member cloned = original.getMember();
        cloned.scores[0] = 100;
        cloned.car.model = "Toyota";

        System.out.println("Original value");
        System.out.println("name : " + original.name);
        System.out.println("age : " + original.age);
        System.out.print("score : {");
        for (int i = 0; i < original.scores.length; i++){
            System.out.print(original.scores[i]);
            System.out.print((i == (original.scores.length - 1)) ? "" : ", ");
        }
        System.out.println("}");
        System.out.println("car : " + original.car.model);
        System.out.println();

        System.out.println("Cloned value");
        System.out.println("name : " + cloned.name);
        System.out.println("age : " + cloned.age);
        System.out.print("score : {");
        for (int i = 0; i < cloned.scores.length; i++){
            System.out.print(cloned.scores[i]);
            System.out.print((i == (cloned.scores.length - 1)) ? "" : ", ");
        }
        System.out.println("}");
        System.out.println("car : " + cloned.car.model);
        System.out.println();
    }
}
