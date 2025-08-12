package chapter_14;

public class _04_UsingThis {
    public int outerField = 10;
    public int innerField = 20;

    class Inner{
        int outerField = 30;
        int innerField = 40;

        void method(){
            _04_MyFunctionalInterface fi = () -> {
                System.out.println("outerField : " + outerField);
                System.out.println("outerField : " + this.outerField);
                System.out.println("outerField : " + _04_UsingThis.this.outerField);


                System.out.println("innerField : " + innerField);
                System.out.println("innerField : " + this.innerField);
                System.out.println("innerField : " + _04_UsingThis.this.innerField);
            };
            fi.method();
        }
    }
}
