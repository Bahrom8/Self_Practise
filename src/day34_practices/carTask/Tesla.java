package day34_practices.carTask;

public class Tesla extends Car  implements AutoPark,AutoPilot{
    public Tesla(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " +getModel() + " started and ready to explore the road");
    }

    @Override
    public void drive() {
        System.out.println("You will really like it when drive " + getMake() + " " + getModel());

    }

    @Override
    public void autoPark() {
        System.out.println("Any car brand cannot do perfect auto parking except " + getMake() + " " + getModel());

    }

    @Override
    public void selfDrive() {
        System.out.println("Very first self driving mode created by " + getMake() + " and " + getModel() + " also has this feature to use");
    }
}
