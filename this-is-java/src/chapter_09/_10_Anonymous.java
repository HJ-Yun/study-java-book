package chapter_09;

public class _10_Anonymous {
    private int field;

    public void method(final int arg1, int arg2){
        final int var1 = 0;
        int var2 = 0;

        field = 10;

        //arg1 = 10;
        //arg2 = 10;

        //var1 = 30;
        //var2 = 30;

        _10_Calculator myCalc = new _10_Calculator() {
            @Override
            public int sum() {
                int result = field + arg1 + arg2 + var1 + var2;
                return result;
            }
        };

        System.out.println(myCalc.sum());
    }
}
