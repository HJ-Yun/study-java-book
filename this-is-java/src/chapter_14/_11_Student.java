package chapter_14;

public class _11_Student {
    private String name;
    private String sex;
    private int score;

    public _11_Student(String name, String sex, int score){
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public int getScore(){
        return score;
    }
}
