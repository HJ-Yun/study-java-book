package chapter_07;

public class _04_SupersonicAirplane extends _04_Airplane{
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly(){
        if (flyMode == SUPERSONIC){
            System.out.println("Supersonic Fly");
        }else {
            super.fly();
        }
    }
}
