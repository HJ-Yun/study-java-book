package chapter_16;

import java.util.Arrays;
import java.util.List;

public class _25_MaleStudentExample {
    public static void main(String[] args) {
        List<_21_Student> totalList = Arrays.asList(
                new _21_Student("Mark",10, _21_Student.Sex.MALE),
                new _21_Student("Nick",10,_21_Student.Sex.FEMALE),
                new _21_Student("Paul",10,_21_Student.Sex.MALE),
                new _21_Student("Jerry",10, _21_Student.Sex.FEMALE)
        );

        _22_MaleStudent maleStudent = totalList.parallelStream()
                .filter(s-> s.getSex() == _21_Student.Sex.FEMALE)
                .collect(_22_MaleStudent::new, _22_MaleStudent::accumulate, _22_MaleStudent::combine);

        maleStudent.getList().stream()
                .forEach(s-> System.out.println(s.getName()));
    }
}
