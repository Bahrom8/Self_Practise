package day29_practices.phoneTask;

public class TestPhoneTask {

    public static void main(String[] args) {
        System.out.println("\n------------iPhone--------------------\n");

        Iphone iphone = new Iphone();
        iphone.setInfo("Apple", "15 Pro Max", "Space Grey", 512, 1200);
        iphone.setBrand("Apple");
        System.out.println(iphone);

        iphone.call(8185737226l);
        iphone.faceTime(8185737226l);
        iphone.faceTime("bakizza97@gmail.com");
        iphone.text(8185737226l);

        System.out.println("\n------------Nokia--------------------\n");

        Nokia nokia = new Nokia();
        nokia.setInfo("Nokia", "6300", "Silver", 64, 300);
        nokia.setBrand("Nokia");
        System.out.println(nokia);
        nokia.selfDefense();

        System.out.println("\n------------Samsung--------------------\n");

        Samsung samsung = new Samsung();
        samsung.setInfo("Samsung", "Galaxy S21", "Black", 256, 900);
        samsung.setBrand("Samsung");
        System.out.println(samsung);
        samsung.freeze();

    }
}
