package chapter_15;

import java.lang.reflect.Member;

public class _06_Member {
    public String name;
    public int age;

    public _06_Member(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode(){
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof _06_Member){
            _06_Member target = (_06_Member) obj;
            return target.name.equals(name) && (target.age == age); //if name and age is same, return "true"
        } else {
            return false;
        }
    }
}
