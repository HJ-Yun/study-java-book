package chapter_15;

import java.util.Comparator;

public class _14_DescendingComparator implements Comparator<_14_Fruit> {
    @Override
    public int compare(_14_Fruit o1, _14_Fruit o2){
        if (o1.price < o2.price) return 1;
        else if (o1.price == o2.price) return 0;
        else return -1;
    }
}
