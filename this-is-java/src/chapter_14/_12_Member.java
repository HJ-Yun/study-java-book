package chapter_14;

public class _12_Member {
    private String name;
    private String id;
    private _12_Address address;

    public _12_Member(String name, String id, _12_Address address){
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public _12_Address getAddress(){
        return address;
    }
}
