package chapter_11;

import java.util.Arrays;

public class _06_Member implements Cloneable{
    public String name;
    public int age;
    public int[] scores;
    public _06_Car car;

    public _06_Member(String name, int age, int[] scores, _06_Car car){
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        _06_Member cloned = (_06_Member) super.clone();

        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
        cloned.car = new _06_Car(this.car.model);

        return cloned;
    }

    public _06_Member getMember(){
        _06_Member cloned = null;
        try {
            cloned = (_06_Member) clone();
        } catch (CloneNotSupportedException e){
            e.getStackTrace();
        }
        return cloned;
    }
}
