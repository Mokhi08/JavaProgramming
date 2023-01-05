package day44_Abstraction.animal;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog = new Dog("Jack", "husky", 'M', 3, "Big", "white");
        dog.bark();
        dog.eat();
        dog.drink();
        System.out.println(dog);

        Tiger tiger = new Tiger("Jack", "husky", 'M', 3, "Big", "white");
        tiger.hunt();
    }
}
