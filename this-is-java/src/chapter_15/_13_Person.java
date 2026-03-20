package chapter_15;

public class _13_Person implements Comparable<_13_Person>{
    public String name;
    public int age;

    public _13_Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(_13_Person o){
        if (age < o.age) return -1;
        else if (age == o.age) return 0;
        else return 1;
    }
}
