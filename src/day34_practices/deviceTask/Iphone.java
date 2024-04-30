package day34_practices.deviceTask;

public class Iphone extends Phone implements Downloadable, AppleApps{
    public Iphone( String model, int size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super( model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println("You are downloading app from " + AppStoreName );
    }

    @Override
    public void turnOn() {
        System.out.println(" For turing on " + getBrand() + " " + getModel() +  " you need to press lock and volume button in same time");
    }

    @Override
    public void turnOff() {
        System.out.println("Your " + getBrand() + " " + getModel() + " is turned off");
    }

    @Override
    public void call(long phoneNumber) {
        super.call(phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {
        super.text(phoneNumber);
    }

}
