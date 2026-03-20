package chapter_15;

public class _08_Student {
    public int sno;
    public String name;

    public _08_Student(int sno, String name){
        this.sno = sno;
        this.name = name;
    }

    public int hashCode(){
        return sno + name.hashCode();
    }

    public boolean equals(Object obj){
        if (obj instanceof _08_Student){
            _08_Student target = (_08_Student) obj;
            return (target.sno == sno) && (target.name.equals(name));
        } else {
            return false;
        }
    }
}
