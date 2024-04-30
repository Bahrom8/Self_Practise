package day34_practices.deviceTask;

public class Google extends Phone implements Downloadable, AndroidApps{

    public Google(String model, int size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super( model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println("Thank you downloading app from " + AppStoreName );

    }

    @Override
    public void turnOn() {
        System.out.println("Thank you buying " + getBrand() + " " + getModel() + " and it is turing on");
    }

    @Override
    public void turnOff() {
        System.out.println("Sorry your  " + getBrand() + " " + getModel() + " is turing off for unknown reason");
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
