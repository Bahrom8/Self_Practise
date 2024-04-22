package day28_practices;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty() || name.isEmpty() || name == null){
            System.err.println("Name can not be empty or blank");
            System.exit(1);
        }

        String specialChars = "";

        for (char each : name.toCharArray()) {
            if(!Character.isLetterOrDigit(each) && each != ' '){  // getting all special character except for space
                specialChars += each;
            }
        }

        if(specialChars.length() > 0){ // if contains special characters other than space
            System.err.println("Invalid Name: " + name);
            System.exit(1);
        }

        if(!Character.isLetter(name.charAt(0))){ // if name does not start with letter
            System.err.println("Invalid Name: " + name);
            System.exit(1);
        }

        if(name.equalsIgnoreCase("toilet paper")){
            this.quantity = 1;
        }

        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0){
            System.err.println("Unit price can not be negative");
            System.exit(1);
        }

        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0){
            System.err.println("Quantity can not be negative");
            System.exit(1);
        }

        this.quantity = quantity;
    }


    public double calcCost(){
        return unitPrice * quantity;
    }

    public String toString() {
        return "\n\tItem" +
                "\nname: " + getName() +
                "\nunit Price: $" + getUnitPrice() +
                "\nquantity: " + getQuantity() +
                "\nTotal Price: $" + calcCost();
    }

    public static void main(String[] args) {

        Item item = new Item("Toilet paper", 0.5,2);
        System.out.println(item);

    }

}
/*
create a class called Item
        private variables:
            name, unitPrice, quantity

        Encapsulate all the fields:
            Conditions:
                name can not be empty or blank
                name can not contain any special characters other than space
                name must start with letters
                unit price can not be negative
                quantity can not be negative
                if the Item name is toilet paper (case insensitive), then the quantity can not be more than 1


        Add a constructor that allows the user to set all the fields when the object is created.
                (If the arguments are not valid, they should not be set to the instances)

        Methods:
            calcCost(): returns the total cost
            toString(): returns the name, unit price, quantity, and total cost info as calculated by calcCost()
 */
