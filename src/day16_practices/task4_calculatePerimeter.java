package day16_practices;

import java.util.Scanner;

public class task4_calculatePerimeter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Enter the radius of the circle:");
            double radius = input.nextDouble();


            if ((radius <= 0)) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(1);
            }

            double diameterOfCircle = radius * 2;
            double areaOfCircle = Math.PI * radius * radius;
            double perimeterOfCircle = Math.PI * diameterOfCircle;

            String formattedAreaOfCircle = String.format("%.1f", areaOfCircle);
            String formattedPerimeterOfCircle = String.format("%.1f", perimeterOfCircle);
            String formattedDiameterOfCircle = String.format("%.1f", diameterOfCircle);

            System.out.println("Diameter Of Circle is: " + formattedDiameterOfCircle);
            System.out.println("Area Of Circle is: " + formattedAreaOfCircle);
            System.out.println("Perimeter Of Circle is: " + formattedPerimeterOfCircle);

            System.out.println("Would you like to calculate another circle? Yes/No");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid entry, Please enter \"yes or no\". Would you like to continue?");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }
        }
    }

}
/*
Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if the user enters 0 or negative numbers,
                                terminate the program after displaying the error
                                message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of a circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using
                                        Cydeo Circle Calculator APP"

                                If the user enters an invalid entry, ask the user
                                to re-enter until the user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire
                        program
 */
