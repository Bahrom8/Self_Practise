package day34_practices.carTask;

public class Audi extends Car implements AutoPark{
    public Audi(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " engine started and ready to drive");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " drives very smooth");

    }

    @Override
    public void autoPark() {
        System.out.println( getMake() + " " + getModel() + " has auto park mode");
    }

}
