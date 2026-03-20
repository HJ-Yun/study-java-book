package chapter_06;

public class _05_CarExample {
    public static void main(String[] args) {
        _05_Car type1 = new _05_Car();
        System.out.println(type1.company + ", " + type1.model + ", " + type1.color + ", " + type1.maxSpeed);
        _05_Car type2 = new _05_Car("Car1");
        System.out.println(type1.company + ", " + type2.model + ", " + type2.color + ", " + type2.maxSpeed);
        _05_Car type3 = new _05_Car("Car2", "Black");
        System.out.println(type1.company + ", " + type3.model + ", " + type3.color + ", " + type3.maxSpeed);
        _05_Car type4 = new _05_Car("Car3","White",300);
        System.out.println(type1.company + ", " + type4.model + ", " + type4.color + ", " + type4.maxSpeed);
    }
}
