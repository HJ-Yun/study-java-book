package chapter_16;

import java.util.Arrays;
import java.util.List;

public class _10_StreamPipelinesExample {
    public static void main(String[] args) {
        List<_10_Member> list = Arrays.asList(
                new _10_Member("Mark",_10_Member.MALE,30),
                new _10_Member("Nick",_10_Member.FEMALE,20),
                new _10_Member("Paul",_10_Member.MALE,45),
                new _10_Member("Jerry",_10_Member.FEMALE,27)
        );

        double avg = list.stream()
                .filter(m -> m.getSex() == _10_Member.MALE)
                .mapToInt(_10_Member::getAge)
                .average().getAsDouble();

        System.out.println("Male Average age : " + avg);
    }
}
