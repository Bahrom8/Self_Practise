package day30_practices.deviceTask;

public class MyDevices {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple", "13 Pro Max", "Space Grey", 512, 1200, true, false);
        System.out.println(iphone);

        Samsung samsung = new Samsung("Samsung", "Galaxy S22", "White", 256, 1000, true, false);
        System.out.println(samsung);

        PersonalComputer PS = new PersonalComputer("Apple", "Mac Studio", "White", 1084, 4500, true, true, 2048, 64, true);
        System.out.println(PS);

        SmartTV smartTV = new SmartTV("Samsung", "QLED", "Black", 55, 500, true, true);
        System.out.println(smartTV);


    }

}
