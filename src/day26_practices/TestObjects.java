package day26_practices;

public class TestObjects {

    public static void main(String[] args) {

        //Task 1

        CydeoStudent cydeoStudent1 = new CydeoStudent("Bakhrom", 26, 'M', "B77", 'A', "JD 02", 2);

        System.out.println(cydeoStudent1);
        cydeoStudent1.study();
        cydeoStudent1.attendClass();

        System.out.println("-------------------------------------------------------");

        //Task2

        Circle circle = new Circle(1.5);
        Circle circle1 = new Circle(2.5);

        System.out.println(circle);
        System.out.println(circle1);

        System.out.println("-------------------------------------------------------");

        //Task3

        Person person1 = new Person("Bakhrom", 26, 'M');

        System.out.println(person1);
        person1.eat("Plov/osh");
        person1.drink("Tea");
        person1.sleep();






    }

}
