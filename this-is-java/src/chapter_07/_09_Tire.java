package chapter_07;

public class _09_Tire {
    //Field
    public int maxRotation;
    public int accumulatedRotation;
    public String location;

    //Constructor
    public _09_Tire(String location, int maxRotation){
        this.location = location;
        this.maxRotation = maxRotation;
    }

    //Method
    public boolean roll(){
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation){
            System.out.println(location + " Tire remain : " + (maxRotation-accumulatedRotation));
            return true;
        }else{
            System.out.println(location + " Tire End");
            return false;
        }
    }
}
