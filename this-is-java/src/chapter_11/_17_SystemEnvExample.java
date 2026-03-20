package chapter_11;

public class _17_SystemEnvExample {
    public static void main(String[] args) {
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("JAVA_HOME : " + javaHome);
    }
}
