package day11_practices;

import java.util.Scanner;

public class Formatter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = input.nextLine();
        System.out.println("Enter last name:");
        String lastName = input.nextLine();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName + " " + lastName);
    }
}
