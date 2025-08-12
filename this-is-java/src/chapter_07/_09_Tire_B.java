package chapter_07;

public class _09_Tire_B extends _09_Tire{
        //Field
        //Constructor
        public _09_Tire_B(String location, int maxRotation){
            super(location, maxRotation);
        }
        //Method
        @Override
        public boolean roll(){
            ++accumulatedRotation;
            if (accumulatedRotation < maxRotation){
                System.out.println(location + " B_Tire remain : " + (maxRotation-accumulatedRotation));
                return true;
            }else{
                System.out.println(location + " B_Tire End");
                return false;
            }
        }
}
