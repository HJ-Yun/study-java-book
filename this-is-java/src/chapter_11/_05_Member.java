package chapter_11;

public class _05_Member implements Cloneable{
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;

    public _05_Member(String id, String name, String password, int age, boolean adult){
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }

    public _05_Member getMember(){
        _05_Member cloned = null;

        try {
            cloned =  (_05_Member) clone();
        } catch (CloneNotSupportedException e){ }
        return cloned;
    }
}
