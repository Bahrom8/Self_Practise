package day27_practices;

public class iPhone {

    public static String brand, OperatingSystem, madeIn, designIn;
    public static boolean isSmartPhone;
    public String model, color;
    public int size;
    public double price;
    public boolean isSmartphone;

    public iPhone(String model, String color, int size, double price) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;

    }

    static {
        brand = "Apple";
        OperatingSystem = "IOS";
        madeIn = "China";
        designIn = "California";
        isSmartPhone = false;
    }

    public void printOperatingSystem(){
        System.out.println(OperatingSystem);
    }

    public void call(long phoneNumber){
        System.out.println("Calling to " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Texting to " + phoneNumber);
    }

    public void faceTime(long phoneNumber){
        System.out.println("FaceTiming to " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println("FaceTiming to " + email);
    }

    public String toString() {
        return "\n\tday27_practices.iPhone" +
                "\nbrand: " + brand +
                "\nmodel: " + model +
                "\ncolor: " + color +
                "\nsize: " + size +
                "\nprice: $" + price +
                "\nOperating System: " + OperatingSystem +
                "\nmade In: " + madeIn +
                "\ndesign In: " + designIn +
                "\nis it Smartphone: " + isSmartphone;
    }

    public static void main(String[] args) {

        iPhone iphone1 = new iPhone("15 Pro Max", "Space Gray", 512, 1200);
        System.out.println(iphone1);

        System.out.println("----------------------------------------");

        iphone1.printOperatingSystem();
        iphone1.call(8185737226l);
        iphone1.text(8185737226l);
        iphone1.faceTime(8185737226l);
        iphone1.faceTime("bakizza97@gamil.com");


    }
}
/*
 Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialize all the fields.

            Add a static block to initialize all the statics.

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */
