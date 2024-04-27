package day31_practices.employeeTask;

public class TestEmployeeObjects {

    public static void main(String[] args) {

         Tester tester = new Tester("Shukhrat", "SD 30", "Google Inc", 27,
                 'M', 120000);
        System.out.println(tester);
        tester.work();

        System.out.println("\n--------------------------------------");

        Developer developer = new Developer("Bakhrom", "JD 2","Apple Inc",
                27, 'M', 210000, "Java");
        System.out.println(developer);
        developer.work();

        System.out.println("\n--------------------------------------");

        Teacher teacher = new Teacher("Muhtar", "GOAT", "CYDEO", 30, 'M',
                2500000);
        System.out.println(teacher);
        teacher.work();

        System.out.println("\n--------------------------------------");

        Driver driver = new Driver("Arman", "Driver78", "Uber", 33, 'M',
                80000);
        System.out.println(driver);
        driver.work();


    }

}
