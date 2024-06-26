package day26_practices;

public class Person {

    public String name;
    public int age;
    public char gender;

    public static boolean isHuman = true;
    public static boolean hasNose = true;
    public static boolean hasWings = false;
    public static int numberOfHead = 1;
    public static int numberOfEyes = 2;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return "\n\tPerson" +
                "\nname: " + name +
                "\nage: " + age +
                "\ngender: " + gender +
                "\nis Human: " + isHuman +
                "\nhas Nose: " + hasNose +
                "\nhas Wings: " + hasWings +
                "\nnumber of Head: " + numberOfHead +
                "\nnumber of Eyes: " + numberOfEyes;
    }
}
/*
Person Task:
		1. Create a class named Person:

				Attributes:
					Instance: name, age, gender

					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

				Add a constructor that can set All the fields (instances)


				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()
 */
