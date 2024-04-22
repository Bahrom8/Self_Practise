package day27_practices;

public class Person {

    public String name, language;
    public int age;
    public char gender;

    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings;
    public static int numberOfHead;
    public static int numberOfEyes;
    public static String planet;

    static {
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
        numberOfEyes = 2;
        planet = "Earth";
    }

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;

    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public void printPlanetName() {
        System.out.println(planet);
    }

    public String toString() {
        return "\n\tPerson" +
                "\nname: " + name +
                "\nage: " + age +
                "\ngender: " + gender +
                "\nlanguage: " + language +
                "\nis Human: " + isHuman +
                "\nhas Nose: " + hasNose +
                "\nnumber of Wings: " + numberOfWings +
                "\nnumber of Head: " + numberOfHead +
                "\nnumber of Eyes: " + numberOfEyes +
                "\nplanet: " + planet;
    }


    public static void main(String[] args) {
        Person person1 = new Person("George", 30, 'M',
                "English");

        System.out.println(person1);
        person1.eat("food");
        person1.drink("water");
        person1.printPlanetName();


    }

}
/*
Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman,
                hasNose, numberOfWings, numberOfHead

            Add a constructor to initialize all the fields.

            Add a static block to initialize all the statics.

            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()
 */
