package chapter_07;

public class _02_StudentExample {
    public static void main(String[] args) {
        _02_Student myStudent = new _02_Student("Konan", "1234-1234", 223);

        System.out.println("name : " + myStudent.name);
        System.out.println("ssn : " + myStudent.ssn);
        System.out.println("Student No." + myStudent.studentNo);
    }
}
