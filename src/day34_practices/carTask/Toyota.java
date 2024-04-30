package day34_practices.carTask;

public class Toyota extends Car{
    public Toyota(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Starting " + getMake() + " " +getModel());
    }

    @Override
    public void drive() {
        System.out.println("Drive " + getMake() + " " + getModel() + " and never go mechanic ever again, unless you might need oil change and tire change");
    }
}
