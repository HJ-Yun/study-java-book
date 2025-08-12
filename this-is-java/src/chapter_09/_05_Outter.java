package chapter_09;

public class _05_Outter {
    String field = "Outter-field";
    void method(){
        System.out.println("Outter-method");
    }

    class Nested{
        String field = "Nested-field";
        void method(){
            System.out.println("Nested-method");
        }

        void print(){
            System.out.println(this.field);
            this.method();
            System.out.println();
            System.out.println(_05_Outter.this.field);
            _05_Outter.this.method();
        }

    }


}
