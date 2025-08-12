package chapter_07;

public abstract class _13_Phone {
    //Field
    public String owner;
    //Constructor
    public _13_Phone(String owner){
        this.owner = owner;
    }
    //Method
    public void turnOn(){
        System.out.println("Turn On");
    }
    public void turnOff(){
        System.out.println("Turn Off");
    }
}
