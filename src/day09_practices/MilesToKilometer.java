package day09_practices;

import java.util.Scanner;

public class MilesToKilometer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles: ");
        double miles = input.nextDouble();
        double kilometer = miles * 1.609;

        System.out.println(miles + " miles equal to " + kilometer + " kilometers");


    }
}
/*
Create a class named MilesToKM, and write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

 */
