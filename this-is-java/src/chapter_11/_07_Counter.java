package chapter_11;

public class _07_Counter {
    public int no;

    public _07_Counter(int no){
        this.no = no;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println(no + "..Finalize");
    }
}
