package chapter_10;

public class _10_FileInputStream implements AutoCloseable{
    private String name;
    public _10_FileInputStream (String name){
        this.name = name;
        System.out.println("File." + name + " Open");;
    }
    public String read1(){
        System.out.println("File." + name + " Read.1");
        return "100";
    }
    public String read2(){
        System.out.println("File." + name + " Read.2");
        return "ABC";
    }
    @Override
    public void close() throws Exception{
        System.out.println("File. " + name + " Close");
    }
}