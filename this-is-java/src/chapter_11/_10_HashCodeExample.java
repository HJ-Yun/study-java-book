package chapter_11;

import java.util.Objects;

public class _10_HashCodeExample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Mark");
        Student s2 = new Student(1, "Mark");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(Objects.hashCode(s2));

    }
    static class Student{
        int sno;
        String name;
        Student(int sno, String name){
            this.sno = sno;
            this.name = name;
        }
        @Override
        public int hashCode(){
            return Objects.hash(sno, name);
        }
    }
}
