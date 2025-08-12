package chapter_16;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class _22_MaleStudentExample {
    public static void main(String[] args) {
        List<_21_Student> totalList = Arrays.asList(
                new _21_Student("Mark",10, _21_Student.Sex.MALE),
                new _21_Student("Nick",6,_21_Student.Sex.FEMALE),
                new _21_Student("Paul",10,_21_Student.Sex.MALE),
                new _21_Student("Jerry",6, _21_Student.Sex.FEMALE)
        );

        //Make stream
        Stream<_21_Student> totalStream = totalList.stream();
        Stream<_21_Student> maleStream = totalStream
                .filter(s->s.getSex() == _21_Student.Sex.MALE);
        //For collect
        Supplier<_22_MaleStudent> supplier = ()-> new _22_MaleStudent();
        BiConsumer<_22_MaleStudent, _21_Student> accumulator = (ms,s)-> ms.accumulate(s);
        BiConsumer<_22_MaleStudent, _22_MaleStudent> combiner = (ms1, ms2)-> ms1.combine(ms2);
        //collect
        _22_MaleStudent maleStudent1 = maleStream.collect(supplier,accumulator,combiner);


        //Not use value
        _22_MaleStudent maleStudent2 = totalList.stream()
                .filter(s->s.getSex() == _21_Student.Sex.MALE)
                .collect(
                        ()-> new _22_MaleStudent(),
                        (r, t)-> r.accumulate(t),
                        (r1, r2)-> r1.combine(r2)
                );


        //Using Method reference
        _22_MaleStudent maleStudent3 = totalList.stream()
                .filter(s->s.getSex() == _21_Student.Sex.MALE)
                .collect(_22_MaleStudent::new, _22_MaleStudent::accumulate, _22_MaleStudent::combine);


        //print
        maleStudent1
                .getList()
                .stream()
                .forEach(s-> System.out.println(s.getName()));
        System.out.println();

        maleStudent2
                .getList()
                .stream()
                .forEach(s-> System.out.println(s.getName()));
        System.out.println();

        maleStudent3
                .getList()
                .stream()
                .forEach(s-> System.out.println(s.getName()));
    }
}
