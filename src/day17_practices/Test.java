package day17_practices;

public class Test {

    public static void main(String[] args) {

        // Task 1 - Car
        Car car1 = new Car();
        car1.setInfo("Tesla", "X", 2021, "Black", 100000);

        System.out.println("\n\tTask1\n");
        System.out.println(car1);

        // Task 2 - Student
        Student student1 = new Student();
        student1.setStudentInfo("Michelle", 'F', 32, "MAIS874", 'B', true);

        System.out.println("\n\tTask2\n");
        System.out.println(student1);

        // Task 3 - Rectangle
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setRectangleInfo(43, 56);

        System.out.println("\n\tTask3\n");
        System.out.println(rectangle1);

        // Task 4 - Salary Calculator
        SalaryCalculator salary1 = new SalaryCalculator();
        salary1.setSalaryInfo(54.7, 0.09, 0.3, 30.5);

        System.out.println("\n\tTask4\n");
        System.out.println(salary1);

        // Task 5 - Address
        Address address1 = new Address();
        address1.setAddress(7925, 22012, "Jones Branch Dr", "McLean", "VA");

        System.out.println("\n\tTask5\n");
        System.out.println(address1);

        // Task 6 - Item
        Item item1 = new Item();
        item1.setItemInfo("Banana", 1, 5);

        System.out.println("\n\tTask6\n");
        System.out.println(item1);

    }

}