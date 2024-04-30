package day34_practices.carTask;

public class CarShop {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2023, 45000, "Black");
        System.out.println(toyota);
        toyota.start();
        toyota.drive();
        toyota.stop();

        Honda honda = new Honda("Accord", 2017, 18000, "White");
        System.out.println(honda);
        honda.start();
        honda.drive();
        honda.stop();

        Audi audi = new Audi("Q7", 2020, 60000, "Silver");
        System.out.println(audi);
        audi.start();
        audi.drive();
        audi.autoPark();
        audi.stop();


        BMW bmw = new BMW("X6", 2021, 80000, "Black");
        System.out.println(bmw);
        bmw.start();
        bmw.drive();
        bmw.stop();


        Mercedes mercedes = new Mercedes("S class", 2022, 85000, "White");
        System.out.println(mercedes);
        mercedes.start();
        mercedes.drive();
        mercedes.autoPark();
        mercedes.stop();


        Tesla tesla = new Tesla("Model X", 2023, 110000, "Gray");
        System.out.println(tesla);
        tesla.start();
        tesla.drive();
        tesla.autoPark();
        tesla.selfDrive();
        tesla.stop();

        Nio nio = new Nio("Unknow", 2022, 50000, "Red");
        System.out.println(nio);
        nio.start();
        nio.drive();
        nio.autoPark();
        nio.selfDrive();
        nio.stop();

        CydeoCar cydeocar = new CydeoCar("Jet Java", 2023, 150000, "changeable");
        System.out.println(cydeocar);
        cydeocar.start();
        cydeocar.drive();
        cydeocar.autoPark();
        cydeocar.selfDrive();
        cydeocar.fly();
        cydeocar.stop();





    }

}
