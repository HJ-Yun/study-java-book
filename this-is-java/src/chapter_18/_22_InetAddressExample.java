package chapter_18;

import java.net.InetAddress;

public class _22_InetAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("My computer : " + local.getHostAddress());

            InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
            for (InetAddress remote : iaArr){
                System.out.println("Naver IP : " + remote.getHostAddress());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
