package chapter_15;

import java.util.List;
import java.util.Vector;

public class _03_VectorExample {
    public static void main(String[] args) {
        List<_03_Board> list = new Vector<_03_Board>();

        list.add(new _03_Board("subject1","content1","writer1")); //index : 0
        list.add(new _03_Board("subject2","content2","writer2")); //index : 1
        list.add(new _03_Board("subject3","content3","writer3")); //index : 2
        list.add(new _03_Board("subject4","content4","writer4")); //index : 3
        list.add(new _03_Board("subject5","content5","writer5")); //index : 4

        list.remove(2);
        list.remove(3);

        for (_03_Board board : list){
            System.out.printf("%s\t%s\t%s\n",board.subject,board.content,board.writer);
        }
    }
}
