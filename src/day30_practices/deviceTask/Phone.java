package day30_practices.deviceTask;

public class Phone extends Device{

    public Phone(String brand, String model, String color, int size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void call(long number){
        System.out.println(getBrand() + " " + getModel() + " calling " + number);
    }

    public void text(long number){
        System.out.println(getBrand() + " " + getModel() + " texting " + number);
    }

}
