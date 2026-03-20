package chapter_10;

public class _10_TryWithResourceExample {
    public static void main(String[] args) {
        try(_10_FileInputStream res = new _10_FileInputStream("ABC")) {
            String data = res.read1();
            int value = Integer.parseInt(data);
        } catch (Exception e){
            System.out.println("Exception" + e.getMessage());
        }
        System.out.println();

        try(_10_FileInputStream res = new _10_FileInputStream("DEF")) {
            String data = res.read2();
            int value = Integer.parseInt(data); //Exception
        } catch (Exception e){
            System.out.println("Exception" + e.getMessage());
        }
        System.out.println();

        try (_10_FileInputStream res1 = new _10_FileInputStream("A");
             _10_FileInputStream res2 = new _10_FileInputStream("B");){
            String data1 = res1.read1();
            String data2 = res2.read1();
        } catch (Exception e){
            System.out.println("Exception" + e.getMessage());
        }
    }
}
