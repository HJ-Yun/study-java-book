package chapter_13;

import java.util.Arrays;

public class _07_WildCardExample {
    public static void registerCourse(_07_Course<?> course){
        System.out.println(course.getName() + " Course : " + Arrays.toString(course.getStudents()));
    }
    public static void registerCourseStudent(_07_Course<? extends _07_Student> course){
        System.out.println(course.getName() + " Course : " + Arrays.toString(course.getStudents()));
    }
    public static void registerCourseWorker(_07_Course<? super _07_Worker> course){
        System.out.println(course.getName() + " Course : " + Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        _07_Course<_07_Person> personCourse = new _07_Course<>("Person",5);
        personCourse.add(new _07_Person("Person"));
        personCourse.add(new _07_Worker("Worker"));
        personCourse.add(new _07_Student("Student"));
        personCourse.add(new _07_HighStudent("High Student"));

        _07_Course<_07_Worker> workerCourse = new _07_Course<>("Worker",5);
        workerCourse.add(new _07_Worker("Worker"));

        _07_Course<_07_Student> studentCourse = new _07_Course<>("Student", 5);
        studentCourse.add(new _07_Student("Student"));
        studentCourse.add(new _07_HighStudent("High Student"));

        _07_Course<_07_HighStudent> highStudentCourse = new _07_Course<>("High Student", 5);
        highStudentCourse.add(new _07_HighStudent("High Student"));

        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);
        System.out.println();

//        registerCourseStudent(personCourse);
//        registerCourseStudent(workerCourse);
        registerCourseStudent(studentCourse);
        registerCourseStudent(highStudentCourse);
        System.out.println();

        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);
//        registerCourseWorker(studentCourse);
//        registerCourseWorker(highStudentCourse);

    }
}
