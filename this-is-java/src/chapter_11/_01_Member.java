package chapter_11;

public class _01_Member {
    public String id;

    public _01_Member(String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof _01_Member){
            _01_Member myMember = (_01_Member) obj;
            if (id.equals(myMember.id)){
                return true;
            }
        }
        return false;
    }
}
