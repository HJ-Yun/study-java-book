package chapter_13;

public class _08_ChildProductAndStorageExample {
    public static void main(String[] args) {
        _08_ChildProduct<Tv,String,String> product = new _08_ChildProduct<>();
        product.setKind(new Tv());
        product.setModel("Smart TV");
        product.setCompany("Samsung");

        _08_Storage<Tv> storage = new _08_StorageImpl<>(100);
        storage.add(new Tv(),0);
        Tv tv = storage.get(0);

        System.out.println(tv);
    }
}
