package chapter_14;

public class _18_Member {
    private String name;
    private String id;

    public _18_Member(){
        System.out.println("Member() Action");
    }
    public _18_Member(String id){
        System.out.println("Member() id Action");
        this.id = id;
    }
    public _18_Member(String name, String id){
        System.out.println("Member() Name, id Action");
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
