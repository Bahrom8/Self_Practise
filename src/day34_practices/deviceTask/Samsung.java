package day34_practices.deviceTask;

public class Samsung extends Phone implements Downloadable, AndroidApps{
    public Samsung( String model, int size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(  model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println("Your " + getBrand() + " " + getModel() + " is downloading app from" + AppStoreName );

    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() +  " turned on");

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
