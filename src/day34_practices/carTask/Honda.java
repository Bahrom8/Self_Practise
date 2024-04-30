package day34_practices.carTask;

public class Honda extends Car{
    public Honda(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " started and ready to drive");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is good for driving");

    }
}
