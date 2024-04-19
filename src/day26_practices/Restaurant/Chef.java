package day26_practices.Restaurant;

public class Chef {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder(){
        System.out.println(name + " is making order");
    }

    public void washDishes(){
        System.out.println(name + " is washing dishes");
    }

    public String toString() {
        return "\n\tChef" +
                "\nname: " + name +
                "\nemployeeID: " + employeeID +
                "\nhourlyRate: $" + hourlyRate +
                "\nfullTime: " + fullTime;
    }


}
