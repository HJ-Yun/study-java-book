package chapter_07;

public class _02_Student extends _02_People {
    public int studentNo;

    public _02_Student(String name, String ssn, int studentNo){
        super(name, ssn);
        this.studentNo = studentNo;
    }
}
