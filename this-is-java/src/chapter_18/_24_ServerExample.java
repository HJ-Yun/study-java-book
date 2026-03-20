package chapter_18;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class _24_ServerExample {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            //Connection with Client
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost",5001));
            boolean serverOn = true;
            while (serverOn){
                System.out.println("[Waiting Connection]");
                Socket socket = serverSocket.accept();
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress(); //get the Client Address
                System.out.println("[Approve the connection : " + isa.getHostName() + "]");

                //Get data from Client
                byte[] bytes = null;
                String message = null;

                InputStream is = socket.getInputStream();
                bytes = new byte[100];
                int readByteCount = is.read(bytes);
                message = new String(bytes,0,readByteCount,"UTF-8");
                System.out.println("[Get Message : " + message + "]");

                //Sending data to Client
                OutputStream ops = socket.getOutputStream();
                message = "Hello! Client!";
                bytes = message.getBytes("UTF-8");
                ops.write(bytes);
                ops.flush();
                System.out.println("[Sending Message]");

                is.close(); ops.close(); socket.close();
                serverOn = false;
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        if (!serverSocket.isClosed()){
            try {
                serverSocket.close();
            } catch (IOException e1){
                e1.printStackTrace();
            }
        }
    }
}
