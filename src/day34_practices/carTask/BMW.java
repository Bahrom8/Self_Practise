package day34_practices.carTask;

public class BMW extends Car{
    public BMW(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " +getModel() + " started because everybody heard very loud noise of engine");
    }

    @Override
    public void drive() {
        System.out.println("You will notice as long as you start driving " + getMake() + " " + getModel() + "'s power");
    }
}
