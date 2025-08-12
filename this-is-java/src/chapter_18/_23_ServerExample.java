package chapter_18;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class _23_ServerExample {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(); //Create Server Socket
            serverSocket.bind(new InetSocketAddress("localhost",5001));
            while (true){
                System.out.println("Connection waiting");
                Socket socket = serverSocket.accept(); //Client connection accept
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("Connection accepted" + isa.getHostName());
            }
        } catch (Exception e){}

        if (!serverSocket.isClosed()){
            try {
                serverSocket.close();
            } catch (IOException e1){}
        }
    }
}
