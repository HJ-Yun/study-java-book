package chapter_15;

import java.util.Iterator;
import java.util.TreeSet;

public class _13_ComparableExample {
    public static void main(String[] args) {
        TreeSet<_13_Person> treeSet = new TreeSet<_13_Person>(); // must need comparable implement

        treeSet.add(new _13_Person("Mark",45));
        treeSet.add(new _13_Person("Nick",25));
        treeSet.add(new _13_Person("Paul",31));

        Iterator<_13_Person> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            _13_Person person = iterator.next();
            System.out.println(person.name + " : " + person.age);
        }
    }
}
