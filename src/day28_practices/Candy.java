package day28_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity <= 0){
            System.err.println("quantity of candy cannot be set to zero or negative");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.err.println("The price of candy cannot be set to negative");
            System.exit(1);

        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public double calCost(){
        return quantity * price;
    }

    public String toString() {
        return "\n\tCandy" +
                "\nbrand: " + brand +
                "\nquantity: " + quantity +
                "\nprice: $" + price +
                "\nhas Peanuts: " + hasPeanuts +
                "\nTotal Price: $" + (( calCost() == 0) ? "Free": "" + calCost() ) ;
    }

    public static void main(String[] args) {

        ArrayList<Candy> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(
                new Candy("M&M", 10, 2.5, false),
                new Candy("Skittels", 7, 3.5, false),
                new Candy("Mars", 4, 1.5, false),
                new Candy("Freshbom", 5, 0.5, false),
                new Candy("M&M", 6, 2.75, false)
        ));


        for (Candy eachCandy : candies) {
            System.out.println(eachCandy.getBrand()+ " : $" + eachCandy.getPrice());
        }

    }
}
/*
Create a custom class named Candy
        private variables:
            brand (String), quantity (int), price (double), hasPeanuts (boolean)

        Encapsulate All the private fields.
                (The price of candy cannot be set to negative)
                (quantity of candy cannot be set to zero or negative)

        Add a constructor that allows the user to set all the fields when the object is created.
                (If the arguments are not valid, they should not be set to the instances)

        Extra methods:
            toString():
                if the price is zero, print "free" instead of 0

        5.1 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                Use a for each loop to print the brand and price of each candy
 */
