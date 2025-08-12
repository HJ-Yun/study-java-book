package chapter_13;

public class _03_ProductExample {
    public static void main(String[] args) {
        _03_Product<_03_TV,String> product1 = new _03_Product<_03_TV,String>();

        product1.setKind(new _03_TV());
        product1.setModel("Smart TV");

        _03_TV tv = product1.getKind();
        String tvModel = product1.getModel();

        _03_Product<_03_Car,String> product2 = new _03_Product<_03_Car,String>();

        product2.setKind(new _03_Car());
        product2.setModel("Tesla");

        _03_Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
