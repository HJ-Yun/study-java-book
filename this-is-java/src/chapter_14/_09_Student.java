package chapter_14;

public class _09_Student {
    private String name;
    private int englishScore;
    private int mathScore;

    public _09_Student(String name, int englishScore, int mathScore){
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public String getName(){
        return name;
    }
    public int getEnglishScore(){
        return englishScore;
    }
    public int getMathScore(){
        return mathScore;
    }
}
