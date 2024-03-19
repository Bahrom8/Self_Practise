package day17_practices;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;

    public void setItemInfo(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calculateItemCost(){
        double itemPrice = unitPrice*quantity;
        return itemPrice;
    }

    public String toString() {
        return "Item name = " + name +
                "\nUnit price = $" + unitPrice +
                "\nQuantity of item = " + quantity +
                "\nTotal Price = $" + calculateItemCost();
    }
}
/*
6. Create a class called Item
    Attributes:
        name, unitPrice, quantity

    Actions:
        setInfo(): sets all the fields of Item object
        calcCost(): returns the total price of the Item
        toString(): when a SalaryCalculator object is passed in a print statement, it should display the full information of the item object
 */