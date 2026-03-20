package chapter_16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _21_ToListExample {
    public static void main(String[] args) {
        List<_21_Student> totalList = Arrays.asList(
                new _21_Student("Mark",10, _21_Student.Sex.MALE),
                new _21_Student("Nick",6,_21_Student.Sex.FEMALE),
                new _21_Student("Paul",10,_21_Student.Sex.MALE),
                new _21_Student("Jerry",6, _21_Student.Sex.FEMALE)
        );

        //Only Male with Name
        List<_21_Student> maleList = totalList.stream()
                .filter(s-> s.getSex() == _21_Student.Sex.MALE)
                .collect(Collectors.toList());
        maleList.stream()
                .forEach(n-> System.out.println(n.getName()));
        System.out.println();

        //Only Female with HashSet
        Set<_21_Student> femaleSet = totalList.stream()
                .filter(s-> s.getSex() == _21_Student.Sex.FEMALE)
                .collect(Collectors.toCollection(HashSet::new));
        femaleSet.stream()
                .forEach(n-> System.out.println(n.getName()));
    }
}
