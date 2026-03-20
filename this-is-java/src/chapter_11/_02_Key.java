package chapter_11;

public class _02_Key {
    public int number;

    public _02_Key(int number){
        this.number = number;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof _02_Key){
            _02_Key compareKey = (_02_Key) obj;
            if (this.number == compareKey.number){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        return number;
    }
}
