package chapter_11;

public class _04_SmartPhone {
    private String company;
    private String os;

    public _04_SmartPhone(String company, String os){
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString(){
        return company + ", " + os;
    }
}
