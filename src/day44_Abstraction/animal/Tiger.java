package day44_Abstraction.animal;

public class Tiger extends Animal implements Wild {

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating deer");
    }

    public void roar(){
        System.out.println(getName()+" is roaring");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting deer");
    }


}
