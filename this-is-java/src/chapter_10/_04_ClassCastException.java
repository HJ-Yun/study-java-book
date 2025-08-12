package chapter_10;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class _04_ClassCastException {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); //Dog ---> Animal
        Cat myCat = (Cat) myAnimal; //Dog ---> Animal ---> Cat
    }

//    public static void changeDog(Animal myAnimal){
//        if (myAnimal instanceof Dog){
//            Dog myDog = (Dog) myAnimal;
//        }
//    }
}
