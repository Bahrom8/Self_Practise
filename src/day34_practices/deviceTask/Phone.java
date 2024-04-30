package day34_practices.deviceTask;

public class Phone extends Device{


    public Phone( String model, int size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Turing on " + getBrand() + getModel() + " device");
    }

    @Override
    public void turnOff() {
        System.out.println("Your " + getBrand() + getModel() + " is turing off");
    }
    public void call(long phoneNumber){
        System.out.println(getBrand() + " " + getModel() +  " is ringing " + phoneNumber + " calling" );
    }
    public void text(long phoneNumber){
        System.out.println(getBrand() + " " + getModel() +  " received text message from " + phoneNumber);
    }


}
