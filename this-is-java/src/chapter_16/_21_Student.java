package chapter_16;

public class _21_Student {
    public enum Sex {MALE, FEMALE};
    public enum City {Tokyo, Seoul};

    private String name;
    private int score;
    private Sex sex;
    private City city;

    public _21_Student(String name, int score, Sex sex){
        this.name = name;
        this.score = score;
        this.sex = sex;
    }

    public _21_Student(String name, int score, Sex sex, City city){
        this.name = name;
        this.score = score;
        this.sex = sex;
        this.city = city;
    }

    public String getName(){
        return name;
    }
    public int getScore() {
        return score;
    }
    public Sex getSex(){
        return sex;
    }
    public City getCity() {
        return city;
    }
}
