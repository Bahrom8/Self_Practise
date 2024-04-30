package day34_practices.deviceTask;

public class Computer extends Device{
    public Computer( String model, int size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super( model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Turing on " + getBrand() + getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("Turing off " + getBrand() + " " + getModel());
    }

}
