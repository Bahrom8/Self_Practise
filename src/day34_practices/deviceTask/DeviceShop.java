package day34_practices.deviceTask;

public class DeviceShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("15 Pro", 512, 1100, "Space Gray", true, true);
        System.out.println(iphone);
        iphone.turnOn();
        iphone.turnOff();
        iphone.text(123456789);
        iphone.call(123456789);
        iphone.downloadApp();

        Samsung samsung = new Samsung("Galaxy S 22", 256, 900, "Black", true, true);
        System.out.println(samsung);
        samsung.turnOn();
        samsung.turnOff();
        samsung.text(123456789);
        samsung.call(123456789);
        samsung.downloadApp();

        Google google = new Google("Pixel", 128, 500, "White", true, true);
        System.out.println(google);
        google.turnOn();
        google.turnOff();
        google.text(123456789);
        google.call(123456789);
        google.downloadApp();

        System.out.println("--------------------------------------------------");

        PersonalComputer personalComputer = new PersonalComputer("Acer", 27, 900, "Black", true, true);
        System.out.println(personalComputer);
        personalComputer.turnOn();
        personalComputer.turnOff();

        Desktop desktop = new Desktop("HP", 32, 1200, "Silver", true, true);
        System.out.println(desktop);
        desktop.turnOn();
        desktop.turnOff();

        Laptop laptop = new Laptop("Dell", 17, 500, "White", true, true);
        System.out.println(laptop);
        laptop.turnOn();
        laptop.turnOff();

    }


}
