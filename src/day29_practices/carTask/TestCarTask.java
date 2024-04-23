package day29_practices.carTask;

import java.time.LocalDate;

public class TestCarTask {
    private String make, model, color;
    private int year;
    private double price;

    public void setInfo(String make, String model, String color, int year, double price) {
        setMake(make = "Rolly Royce");
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        if(model == null){
            model = "Unknown";
        }
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        if(color == null){
            color = "Unknown";
        }
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 1850 || year > LocalDate.now().getYear()){
            System.err.println("Invalid car year " + year);
            System.exit(1);
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.err.println("Price cannot be negative");
            System.exit(1);
        }
        this.price = price;
    }

    public String toString() {
        return getClass().getSimpleName() +
                "\nmake: " + getMake() +
                "\nmodel: " + getModel() +
                "\ncolor: " + getColor() +
                "\nyear: " + getYear() +
                "\nprice: $" + getPrice();
    }



}
