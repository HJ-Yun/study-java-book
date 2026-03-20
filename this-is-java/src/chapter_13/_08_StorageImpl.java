package chapter_13;

public class _08_StorageImpl<T> implements _08_Storage<T>{
    private T[] array;

    public _08_StorageImpl(int capacity){
        this.array = (T[]) (new Object[capacity]);
    }

    @Override
    public void add(T item, int index){
        array[index] = item;
    }

    @Override
    public T get(int index){
        return array[index];
    }
}
