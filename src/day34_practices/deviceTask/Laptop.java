package day34_practices.deviceTask;

public class Laptop extends Computer{
    public Laptop(String model, int size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }
}
