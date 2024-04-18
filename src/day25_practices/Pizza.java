package day25_practices;

public class Pizza {

    public String size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping, quantity;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping, int quantity) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        this.quantity = quantity;
    }

    public double calcCost(){
        double basePrice = 0;
        if(size.equalsIgnoreCase("small")){
            basePrice = 10;
        }else if( size.equalsIgnoreCase("medium")){
            basePrice = 12;
        }else if(size.equalsIgnoreCase("large")){
            basePrice = 14;
        }

        double topping = (2 * numberOfPepperoniTopping) + (2 * numberOfCheeseTopping);
        double total = (basePrice + topping) * quantity;

        return total;
    }

    public String toString() {
        return "\n\tPizza\n" +
                "size: " + size +
                "\nnumberOfCheeseTopping: " + numberOfCheeseTopping +
                "\nnumberOfPepperoniTopping: " + numberOfPepperoniTopping +
                "\nquantity: " + quantity +
                "\nTotal cost: $" + calcCost();
    }
}
/*
Create a custom class named Pizza:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size,
            quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */
