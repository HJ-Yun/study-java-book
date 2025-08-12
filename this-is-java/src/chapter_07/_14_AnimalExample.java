package chapter_07;

public class _14_AnimalExample {
    public static void main(String[] args) {
        _14_Dog myDog = new _14_Dog();
        _14_Cat myCat = new _14_Cat();
        myDog.sound();
        myCat.sound();
        System.out.println("--------");

        _14_Animal myAnimal = null;
        myAnimal = new _14_Dog();
        myAnimal.sound();
        myAnimal = new _14_Cat();
        myAnimal.sound();
        System.out.println("--------");

        animalSound(new _14_Dog());
        animalSound(new _14_Cat());
    }

    public static void animalSound(_14_Animal animal){
        animal.sound();
    }
}
