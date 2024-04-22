package day27_practices;

public class Dog {

    public String breed, color, size;
    public int age;
    public char gender;
    public boolean isFriendly;

    public static int numberOfLegs;
    public static int numberOfEyes;
    public static boolean hasWings;


    static {
        numberOfEyes = 2;
        numberOfLegs = 4;
        hasWings = false;
    }

    public Dog(String breed, String color, String size, int age, char gender, boolean isFriendly) {
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.age = age;
        this.gender = gender;
        this.isFriendly = isFriendly;
    }

    public void eat(){
        System.out.println(breed + " is eating");
    }

    public void drink(){
        System.out.println(breed + " is drinking");
    }

    public void sleep(){
        System.out.println(breed + " is sleeping");
    }

    public void play(){
        System.out.println(breed + " is playing");
    }

    public void bark(){
        System.out.println(breed + " is barking");
    }

    public String toString() {
        return "\n\tDog" +
                "\nbreed: " + breed +
                "\ncolor: " + color +
                "\nsize: " + size +
                "\nage: " + age +
                "\ngender: " + gender +
                "\nnumber of Eyes: " + numberOfEyes +
                "\nnumber of Legs: " + numberOfLegs +
                "\nhas Wings: " + hasWings +
                "\nis Friendly: " + isFriendly;
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog("Husky", "Black", "Medium", 4, 'M', true);

        System.out.println(dog1);
        dog1.eat();
        dog1.drink();
        dog1.sleep();
        dog1.play();
        dog1.bark();

    }

}
/*
Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialize all the fields.

            Add a static block to initialize all the statics.

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
 */
