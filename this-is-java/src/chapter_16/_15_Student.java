package chapter_16;

public class _15_Student implements Comparable<_15_Student>{
    private String name;
    private int score;

    public _15_Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }

    @Override
    public int compareTo(_15_Student o){
        return Integer.compare(score,o.score);
    }
}
