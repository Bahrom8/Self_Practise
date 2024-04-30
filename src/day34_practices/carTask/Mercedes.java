package day34_practices.carTask;

public class Mercedes extends Car implements AutoPark{
    public Mercedes(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " +getModel() + " started while you are looking to beautiful interior");
    }

    @Override
    public void drive() {
        System.out.println("You are drive on of the most luxury car, which is " + getMake() + " " + getModel());

    }

    @Override
    public void autoPark() {
        System.out.println("When you buy " + getMake() + " " + getModel()
                + " for so expensive and if it has no auto parking feature, " +
                "you would want your money back right? ");

    }
}
