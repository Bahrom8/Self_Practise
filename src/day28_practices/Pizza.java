package day28_practices;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(!(size.equalsIgnoreCase("small") ||
                size.equalsIgnoreCase("medium") ||
                size.equalsIgnoreCase("large"))){
            System.err.println("Invalid pizza size: " + size);
            System.exit(1);
        }

        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if(numberOfCheeseTopping < 0){
            System.err.println("Invalid number of cheese topping");
            System.exit(1);
        }

        if (size.equalsIgnoreCase("small") && numberOfCheeseTopping <=3 ){
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }else if(size.equalsIgnoreCase("medium") && numberOfCheeseTopping <=4 ){
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }else if(size.equalsIgnoreCase("large") && numberOfCheeseTopping <=5){
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }else{
            System.err.println("Invalid number of cheese topping");
            System.exit(1);
        }

        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if(numberOfPepperoniTopping < 0){
            System.err.println("Invalid number of pepperoni topping");
            System.exit(1);
        }

        if (size.equalsIgnoreCase("small") && numberOfPepperoniTopping <=4 ){
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }else if(size.equalsIgnoreCase("medium") && numberOfPepperoniTopping <=5 ){
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }else if(size.equalsIgnoreCase("large") && numberOfPepperoniTopping <=6){
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }else{
            System.err.println("Invalid number of pepperoni topping");
            System.exit(1);
        }

        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calCost(){
        double price = 0;
        if(size.equalsIgnoreCase("small")){
            price = 10;
        }else if( size.equalsIgnoreCase("medium")){
            price = 12;
        }else if(size.equalsIgnoreCase("large")){
            price = 14;
        }

        double total = price + (2 * numberOfPepperoniTopping) + (2 * numberOfCheeseTopping);

        return total;
    }

    public String toString() {
        return "\n\tPizza" +
                "\nsize: " + getSize() +
                "\nnumber Of Cheese Topping: " + getNumberOfCheeseTopping() +
                "\nnumber Of Pepperoni Topping: " + getNumberOfPepperoniTopping() +
                "\nTotal Price: " + calCost();
    }

    public static void main(String[] args) {

        Pizza pizza = new Pizza("SMALL", 3,2);
        System.out.println(pizza);

        Pizza pizza1 = new Pizza("Medium",0,0);
        System.out.println(pizza1);

        Pizza pizza2 = new Pizza("laRGE", 5,0);
        System.out.println(pizza2);

    }
}
/*
Create a class named Pizza:
                Private variables:
                    size, numberOfCheeseTopping, numberOfPepperoniTopping

                Encapsulate all the fields.
                        Conditions:
                            The size of the pizza can only be small, medium, or large. case-insensitive

                            The number of cheese toppings can not be negative; the maximum number of
                            cheese toppings is:
                                        small: 3
                                        medium: 4
                                        large: 5

                            The number of pepperoni toppings can not be negative; the maximum number of
                            pepperoni toppings is:

                                        small: 4
                                        medium: 5
                                        large: 6

                Add a constructor that allows the user to set all the fields when the object is created.
                                (If the arguments are not valid, they should not be set to the instances)


                Methods:
                    calcCost(): returns the total cost of the pizza
                    toString(): returns a String containing the pizza size, quantity of each topping, and
                    the pizza cost as calculated by calcCost()


        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */
