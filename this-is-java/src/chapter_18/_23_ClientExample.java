package chapter_18;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class _23_ClientExample {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket();
            System.out.println("Request Connection");
            socket.connect(new InetSocketAddress("localhost",5001));
            System.out.println("Connection success");
        } catch (Exception e){}

        if (!socket.isClosed()){
            try {
                socket.close();
            } catch (IOException e1){}
        }

    }
}
