package day34_practices.carTask;

public abstract class Car {

    private final String make,model;

    private final int year;
    private double price;

    public String color;


    public Car( String model, int year, double price, String color) {
        this.make = getClass().getSimpleName();
        if(make == null || make.isEmpty()){
            System.out.println("Make can not be empty or null");
            System.exit(1);
        }

        if(model == null || model.isEmpty()){
            System.out.println("Model can not be null or empty.");
            System.exit(1);
        }
        this.model = model;
        if(year < 1886){
            System.out.println("Invalid value: " + year);
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return getClass().getSimpleName();
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }


    public void setPrice(double price) {
        if(price <= 0){
            System.out.println("Invalid value: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract void start();
    public abstract void drive();

    public void stop(){
        System.out.println("Press the break and put the parking once " + getMake()+ " " + getModel() +  " is fully stopped");
    }

    @Override
    public String toString() {
        return "\n\n" +
                "make: " + make +
                "\nmodel: " + model +
                "\nyear: " + year +
                "\ncolor: " + color +
                "\nprice: $" + price;
    }

}
/*
Car Task:
	1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields.

				Add a constructor that can set all the fields.

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

				Abstract methods:
					start();
					drive();

				None-abstract methods:
					stop()
					toString()


	2. Create an interface named AutoPark
				Variables:
					hasAutoPark

				Abstract method:
					autoPark();

	3. Create a child interface of AutoPark named AutoPilot
						hint: interface can inherit from another interface by using the extends keyword
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();

	4. Create an interface named Flyable
				Variables:
						canFly

				Abstract Method
					fly();


	5. Create a subclass of Car named Toyota

	6. Create a subclass of Car named Honda

	7. Create a subclass of Car named BMW

	8. Create two subclasses of Car named Audi &  Mercedes that implement the AutoPark interface

	9. Create Two subclasses of Car named Tesla & Nio that implement AutoPark & AutoPilot interfaces

	10 Create a subclass of Car named CydeoCar that implements AutoPark, AutoPilot, and Flyable interfaces

	11. Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each object.

            Analyze the relationships between the classes.

 */
