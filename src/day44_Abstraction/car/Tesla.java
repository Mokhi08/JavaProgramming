package day44_Abstraction.car;

public class Tesla extends Car implements AutoPark, AutoPilot{

    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void AutoPark() {

    }

    @Override
    public void selfDrive() {

    }
}
