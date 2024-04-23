package day29_practices.phoneTask;

public class PhoneTask {
    private String brand, model, color;
    private int size;
    private double price;

    public void setInfo(String brand, String model, String color, int size, double price) {
        setBrand(brand = "Tesla");
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
    }

    public String getBrand() {
        if(brand == null){
            System.err.println("Brand has not been set");
            System.exit(1);
        }
        return brand;
    }

    public void setBrand(String brand) {
        if(brand.isEmpty() || brand.isBlank()){
            System.err.println("Brand name can not empty or blank");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        if(model == null){
            System.err.println("Model has not been set");
            System.exit(1);
        }
        return model;
    }

    public void setModel(String model) {
        if(model.isEmpty() || model.isBlank()){
            System.err.println("Model name can not empty or blank");
            System.exit(1);
        }
        this.model = model;
    }

    public String getColor() {
        if(color == null){
            System.err.println("Color has not been set");
            System.exit(1);
        }
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty() || color.isBlank()){
            System.err.println("Color name can not empty or blank");
            System.exit(1);
        }
        this.color = color;
    }

    public int getSize() {
        if(size <= 0){
            System.err.println("Size has not been set");
            System.exit(1);
        }
        return size;
    }

    public void setSize(int size) {

        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public String toString() {
        return getClass().getSimpleName() +
                "\nbrand: " + getBrand() +
                "\nmodel: " + getModel() +
                "\ncolor: " + getColor() +
                "\nsize: " + getSize() +
                "\nprice: $" + getPrice();
    }

}
