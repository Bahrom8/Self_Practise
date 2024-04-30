package day34_practices.deviceTask;

public abstract class Device {
    private final String brand, model;
    private final int size;

    private double price;
    private String color;
    private boolean hasBattery, hasPowerButton;

    public Device( String model, int size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        this.brand = getClass().getSimpleName();
        if(brand == null || brand.isEmpty()){
            throw new RuntimeException("Brand cannot be empty or null");
        }

        if(model == null || model.isEmpty()){
           throw new RuntimeException("Model cannot be empty or null");
        }
        this.model = model;
        if(size == 0){
            throw new RuntimeException("Size cannot be 0");
        }
        this.size = size;
        setPrice(price);
        setColor(color);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new RuntimeException("Invalid price : " + getPrice());
        }
        this.price = price;
    }

    public void setColor(String color) {
        if(color == null || color.isEmpty()){
            throw new RuntimeException("Color cannot be empty");
        }
        this.color = color;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }



    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return "\n\t" + getClass().getSimpleName()+
                "\nmodel: " + model +
                "\nprice: $" + price;
    }
}
/*
1. Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields.

			Add a constructor to set all the fields.

						Condition:
							1. brand, model color, and size can not be null (if obj == null means it's an error)
							2. brand, model color, and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price


	2. Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()


	3. Create a child abstract class of Device named Computer:

					Add any extra methods if needed.

	4. Create an interface named downloadable:

				Abstract method:
					downloadApp();

	5. Create a child interface of Downloadable named AndroidApps:
			Variables:
				AppStoreName, OS

	6. Create a child interface of Downloadable named AppleApps

			Variables:
				AppStoreName, OS


	7. Create the following subclasses of Phone and add any extra methods that are needed:

				1. Iphone :
						extends Phone class and implements Downloadable & AppleApps interfaces

				2. Samsung:
						extends Phone class and implements Downloadable & AndroidApps interfaces

				4. Google:
						extends Phone class and implements Downloadable & AndroidApps interfaces


	8. Create the following subclasses of Computer and add any extra methods that are needed:
				1. PersonalComputer:
				1. Desktop
				2. Laptop


	9. Create a class named DeviceShop:
			Create an object from each concrete class.

			Test all the functions of each object.

            Analyze the relationships between the classes.

 */
