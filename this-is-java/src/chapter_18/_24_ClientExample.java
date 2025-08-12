package chapter_18;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class _24_ClientExample {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            //Connection with Server
            socket = new Socket();
            socket.connect(new InetSocketAddress("localhost",5001));
            System.out.println("[Connection Success]");

            //Sending data to Server
            byte[] bytes = null;
            String message = null;

            OutputStream ops = socket.getOutputStream();
            message = "Hello! Server!";
            bytes = message.getBytes("UTF-8");
            ops.write(bytes);
            ops.flush();
            System.out.println("[Sending Message]");

            //Get data from Server
            InputStream is = socket.getInputStream();
            bytes = new byte[100];
            int readByCounnt = is.read(bytes);
            message = new String(bytes,0,readByCounnt,"UTF-8");
            System.out.println("[Get Message : " + message + "]");

            ops.close(); is.close();
        } catch (Exception e){
            e.printStackTrace();
        }

        if (!socket.isClosed()){
            try {
                socket.close();
            } catch (IOException e1){
                e1.printStackTrace();
            }
        }
    }
}
