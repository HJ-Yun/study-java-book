package chapter_15;

import java.util.Iterator;
import java.util.TreeSet;

public class _14_ComparatorExample {
    public static void main(String[] args) {
        /*
        TreeSet<_14_Fruit> treeSet = new TreeSet<_14_Fruit>();
        treeSet.add(new _14_Fruit("Grape",3000));
        treeSet.add(new _14_Fruit("Apple",10000));
        treeSet.add(new _14_Fruit("Orange",6000));
        */ //error : there is no Comparable

        TreeSet<_14_Fruit> treeSet = new TreeSet<_14_Fruit>(new _14_DescendingComparator());
        treeSet.add(new _14_Fruit("Grape",3000));
        treeSet.add(new _14_Fruit("Apple",10000));
        treeSet.add(new _14_Fruit("Orange",6000));

        Iterator<_14_Fruit> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            _14_Fruit fruit = iterator.next();
            System.out.println(fruit.name + " : " + fruit.price);
        }
    }
}
