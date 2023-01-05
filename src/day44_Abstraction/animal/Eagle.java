package day44_Abstraction.animal;

public class Eagle extends Animal implements Wild{


    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating snake");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting mammals");
    }
}
