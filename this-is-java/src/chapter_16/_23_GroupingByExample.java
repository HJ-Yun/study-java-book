package chapter_16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _23_GroupingByExample {
    public static void main(String[] args) {
        List<_21_Student> totalList = Arrays.asList(
                new _21_Student("Mark",10, _21_Student.Sex.MALE, _21_Student.City.Seoul),
                new _21_Student("Nick",6,_21_Student.Sex.FEMALE, _21_Student.City.Tokyo),
                new _21_Student("Paul",10,_21_Student.Sex.MALE, _21_Student.City.Tokyo),
                new _21_Student("Jerry",6, _21_Student.Sex.FEMALE, _21_Student.City.Seoul)
        );

        //Make Stream
        Stream<_21_Student> totalStream = totalList.stream();
        //Make Grouping condition
        Function<_21_Student, _21_Student.Sex> classifierSex = _21_Student::getSex;
        //Grouping and Collecting the Student Sex -> List
        Collector<_21_Student,?, Map<_21_Student.Sex, List<_21_Student>>> collectorSex =
                Collectors.groupingBy(classifierSex);
        //Make the Map with the List
        Map<_21_Student.Sex, List<_21_Student>> mayBySex1 = totalStream.collect(collectorSex);


        //Using Method reference
        Map<_21_Student.Sex, List<_21_Student>> mapBySex2 = totalList.stream()
                        .collect(Collectors.groupingBy(_21_Student::getSex));

        System.out.println("[Group by Sex]");
        System.out.print("[Male] : ");
        //Key - Sex, Value - List
        mayBySex1.get(_21_Student.Sex.MALE)
                .stream().forEach(s-> System.out.print(s.getName() + " "));
        System.out.print("\n[Female] : ");
        mapBySex2.get(_21_Student.Sex.FEMALE)
                .stream().forEach(s-> System.out.print(s.getName() + " "));

        //Make Stream
        totalStream = totalList.stream();
        //Make Grouping condition
        Function<_21_Student, _21_Student.City> classifierCity = _21_Student::getCity;
        //Get the student name
        Function<_21_Student, String> mapper = _21_Student::getName;
        //Make the Collector making String to String List
        Collector<String,?, List<String>> collector = Collectors.toList();
        //Make the name List using name String.
        Collector<_21_Student, ?, List<String>> nameList = Collectors.mapping(mapper,collector);
        //Grouping and Collecting the nameList and cityList
        Collector<_21_Student,?,Map<_21_Student.City,List<String>>> collectorCity =
                Collectors.groupingBy(classifierCity,nameList);
        //Make the Map with the List
        Map<_21_Student.City, List<String>> mapByCity1 = totalStream.collect(collectorCity);


        //Using Method reference
        Map<_21_Student.City, List<String>> mapByCity2 = totalList.stream()
                        .collect(
                                Collectors.groupingBy(
                                        _21_Student::getCity,
                                        Collectors.mapping(_21_Student::getName, Collectors.toList())
                                )
                        );

        System.out.println("\n[Group by City]");
        System.out.print("[Seoul] : ");
        //Key - City, Value - Name
        mapByCity1.get(_21_Student.City.Seoul)
                .stream()
                .forEach(s-> System.out.print(s + " "));
        System.out.print("\n[Tokyo] : ");
        mapByCity2.get(_21_Student.City.Tokyo)
                .stream()
                .forEach(s-> System.out.print(s + " "));
    }
}
