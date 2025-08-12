package chapter_07;

public class _05_SportsCar extends _05_Car{
    @Override
    public void speedUp() {
        speed += 10;
    }

//    @Override // public final void stop() ---> "final" Can not override
//    public void stop(){
//        System.out.println("Stop the sports car");
//        speed = 0;
//    }
}
