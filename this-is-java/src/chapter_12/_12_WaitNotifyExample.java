package chapter_12;

public class _12_WaitNotifyExample {
    public static void main(String[] args) {
        _12_DataBox dataBox = new _12_DataBox();

        _12_ProducerThread producerThread = new _12_ProducerThread(dataBox);
        _12_ConsumerThread consumerThread = new _12_ConsumerThread(dataBox);

        producerThread.start();
        consumerThread.start();
    }
}
