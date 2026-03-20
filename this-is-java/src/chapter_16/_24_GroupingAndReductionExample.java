package chapter_16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _24_GroupingAndReductionExample {
    public static void main(String[] args) {
        List<_21_Student> totalList = Arrays.asList(
                new _21_Student("Mark",10, _21_Student.Sex.MALE),
                new _21_Student("Nick",6,_21_Student.Sex.FEMALE),
                new _21_Student("Paul",10,_21_Student.Sex.MALE),
                new _21_Student("Jerry",6, _21_Student.Sex.FEMALE)
        );

        //Make stream
        Stream<_21_Student> totalStream = totalList.stream();
        //Make grouping condition
        Function<_21_Student, _21_Student.Sex> classifierSex = _21_Student::getSex;
        //Get Student score
        ToDoubleFunction<_21_Student> mapper = _21_Student::getScore;
        //Make the average List with score
        Collector<_21_Student, ?, Double> scoreList = Collectors.averagingDouble(mapper);
        //Grouping and Collecting the sexList and scoreList
        Collector<_21_Student, ?, Map<_21_Student.Sex, Double>> collectorSex =
                Collectors.groupingBy(classifierSex,scoreList);
        //Make the Map with the List
        Map<_21_Student.Sex, Double> mapBySex1 = totalStream.collect(collectorSex);


        //Using Method reference
        Map<_21_Student.Sex, Double> mapBySex2 = totalList.stream()
                        .collect(
                                Collectors.groupingBy(
                                        _21_Student::getSex,
                                        Collectors.averagingDouble(_21_Student::getScore)
                                )
                        );
        System.out.println("[Score average by Sex]");
        //Key - Sex, Value - Score average
        System.out.println("[Male] : " + mapBySex1.get(_21_Student.Sex.MALE));
        System.out.println("[Female] : " + mapBySex2.get(_21_Student.Sex.FEMALE));

        Map<_21_Student.Sex, String> mapBySex3 = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                _21_Student::getSex,
                                Collectors.mapping(
                                        _21_Student::getName,
                                        Collectors.joining(",")
                                )
                        )
                );

        System.out.println("[Name by Sex]");
        //Key - Sex, Value - Name
        System.out.println("[Male] : " + mapBySex3.get(_21_Student.Sex.MALE));
        System.out.println("[Female] : " + mapBySex3.get(_21_Student.Sex.FEMALE));
    }

}
