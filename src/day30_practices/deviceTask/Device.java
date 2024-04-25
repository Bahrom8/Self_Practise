package day30_practices.deviceTask;

public class Device {

    private String brand, model, color;
    private int size;
    private double price;
    private boolean hasBattery, hasPowerButton;

    public Device(String brand, String model, String color, int size, double price, boolean hasBattery, boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.isEmpty() || brand.isBlank() || brand == null){
            System.err.println("Brand can not be empty or blank");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isEmpty() || model.isBlank() || model == null){
            System.err.println("Model can not be empty or blank");
            System.exit(1);
        }
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.err.println("Price can not be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public void turnOn(){
        System.out.println(getBrand() + " " + getModel() + " is turning on");
    }

    public void turnOff(){
        System.out.println(getBrand() + " " + getModel() + " is turning off");
    }

    public String toString() {
        return "\nDevice" +
                " brand: " + brand +
                "\nmodel: " + model +
                "\ncolor: " + color +
                "\nsize: " + size +
                "\nprice: $" + price +
                "\nhasBattery: " + hasBattery +
                "\nhasPowerButton: " + hasPowerButton;
    }
}
/*
1. Create a class named Device
			Variables:
				brand, model, color, size, price
				hasBattery, hasPowerButton

			Encapsulate all the fields
					Conditions:
						1. brand, model cannot be null
						2. brand, model cannot be empty or blank
						3. price cannot be zero or negative

			Methods
				turnOn()
				turnOff()
				toString()


	2. Create The following sub-classes of Device

			1. Phone
				Extra methods:
					call(), text()

			2. TV
				Extra methods:
					channelUp()
					channelDown()

			3. Computer
				Add any extra variables/methods if needed

	3. Create the following sub-classes of Phone and add any extra methods that are needed:

				1. Iphone
				2. Samsung
				3. BlackBerry
				4. Google
				5. Nokia


	4. Create the following sub-classes of Computer and add any extra methods that are needed:
				1. PersonalComputer
				2. Desktop
				3. Laptop

	5. Create the following subclasses of TV and add any extra methods that are needed:
				1. SmartTV


	6. Create a class named MyDevices:
			Create the objects of each subclasses and

			test all the functions of each object

            Analyze the relationships between the classes

 */
