package day34_practices.carTask;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable {
    public CydeoCar(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " started and ready to drive and fly");
    }

    @Override
    public void drive() {
        System.out.println("You are driving best car ever world seen which is " + getMake() + " " + getModel());

    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel()
                + " can do anything even auto parking better than your girl friend");

    }

    @Override
    public void selfDrive() {
        System.out.println("You can trust  " + getMake() + " " + getModel()
                + "'s self drive mode, drives better than Tesla");

    }

    @Override
    public void fly() {
        System.out.println("You don't need to go to Airport, just get " + getMake() + " "
                + getModel() + " and see the world from the sky");
    }
}
