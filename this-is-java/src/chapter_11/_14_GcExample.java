package chapter_11;

public class _14_GcExample {
    public static void main(String[] args) {
        Employee emp;

        emp = new Employee(1);
        emp = null;
        emp = new Employee(2);
        emp = new Employee(3);

        System.out.print("Final emp number is ");
        System.out.println(emp.eno);
        System.gc();
    }

}
class Employee {
    public int eno;

    public Employee(int eno) {
        this.eno = eno;
        System.out.println("Employee(" + eno + ") is activated.");
    }

    public void finalize() {
        System.out.println("Employee(" + eno + ")is deleted.");
    }
}