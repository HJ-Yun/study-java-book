package chapter_15;

import java.util.LinkedList;
import java.util.Queue;

public class _16_QueueExample {
    public static void main(String[] args) {
        Queue<_16_Message> messageQueue = new LinkedList<_16_Message>();

        messageQueue.offer(new _16_Message("sendMail","Mark"));
        messageQueue.offer(new _16_Message("sendSMS","Nick"));
        messageQueue.offer(new _16_Message("sendLine","Paul"));

        while (!messageQueue.isEmpty()){
            _16_Message message = messageQueue.poll();
            switch (message.command){
                case "sendMail":
                    System.out.println("Sending mail to " + message.to);
                    break;
                case "sendSMS":
                    System.out.println("Sending SMS to " + message.to);
                    break;
                case "sendLine":
                    System.out.println("Sending Line to " + message.to);
                    break;
            }
        }
    }
}
