package day17_practices;

public class Car {

    public String make, model, color;
    public int year;
    public double price;

    public void setInfo(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return "Car " +
                "make = '" + make + '\'' +
                ", model = '" + model + '\'' +
                ", year = " + year +
                ", color = '" + color + '\'' +
                ", price = $" + price;
    }



}
/*
1. Create a custom class named Car
        Attributes:
            make, model, year, color, price

        Actions:
            setInfo(): sets all the fields of the car object
            toString(): when a car object is passed in a print statement,
            it should display all the information of the car object
            start()
 */