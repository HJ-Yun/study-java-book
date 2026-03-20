package chapter_16;

import java.util.ArrayList;
import java.util.List;

public class _22_MaleStudent {
    private List<_21_Student> list;

    public _22_MaleStudent(){
        list = new ArrayList<_21_Student>();
        System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
    }

    public void accumulate(_21_Student student){
        list.add(student);
        System.out.println("[" + Thread.currentThread().getName()+ "] accumulate()");
    }

    public void combine(_22_MaleStudent other){
        list.addAll(other.getList());
    }

    public List<_21_Student> getList(){
        return list;
    }
}
