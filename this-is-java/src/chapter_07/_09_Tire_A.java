package chapter_07;

public class _09_Tire_A extends _09_Tire{
    //Field
    //Constructor
    public _09_Tire_A(String location, int maxRotation){
        super(location, maxRotation);
    }
    //Method
    @Override
    public boolean roll(){
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation){
            System.out.println(location + " A_Tire remain : " + (maxRotation-accumulatedRotation));
            return true;
        }else{
            System.out.println(location + " A_Tire End");
            return false;
        }
    }
}
