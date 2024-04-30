package day34_practices.carTask;

public class Nio extends Car implements AutoPark,AutoPilot{
    public Nio(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " started, if you did not hear the voice of " + getModel());
    }

    @Override
    public void drive() {
        System.out.println("You are driving " + getMake() + " " + getModel() + ", if you forgot what kind of car was it");

    }

    @Override
    public void autoPark() {
        System.out.println("Auto Park feature of " + getMake() + " " + getModel() + " same as with Tesla, we hope");

    }

    @Override
    public void selfDrive() {
        System.out.println("Self Driving " + getMake() + " " + getModel() + " is better than any car, we assume");

    }
}
