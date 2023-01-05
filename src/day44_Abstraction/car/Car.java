package day44_Abstraction.car;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if(make.isEmpty()||make.equals(null)){
            throw new RuntimeException("Invalid make: " + make);
        }
        this.make = make;
        if(model.isEmpty()||model.equals(null)){
            throw new RuntimeException("Invalid model: "+ model);
        }
        this.model = model;
        if(year<1886){
            throw new RuntimeException("Invalid year: " + year);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            throw new RuntimeException("Invalid price: " + price);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()||color.equals(null)){
            throw new RuntimeException("Invalid color: "+ color);
        }
        this.color = color;
    }

    public abstract void start();

    public abstract void drive();

    public final void stop(){
        System.out.println(model+make+" is stopping");
    }


}
/*
Variables:
make (final), model (final),
year (final), price, color
 */