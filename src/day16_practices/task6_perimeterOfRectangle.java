package day16_practices;

import java.util.Scanner;

public class task6_perimeterOfRectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Enter the length of the Rectangle:");
            double length = input.nextDouble();

            if( length <= 0){
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(1);
            }

            System.out.println("Enter the width of the Rectangle:");
            double width = input.nextDouble();

            if( width <= 0 ){
                System.err.println("Invalid Entry for the width of the rectangle");
                System.exit(1);
            }

            double perimeterOfRectangle = 2 * (length + width);
            double areOfRectangle = length * width;

            System.out.println("Are Of Rectangle is: " + areOfRectangle);
            System.out.println("Perimeter Of Rectangle is " + perimeterOfRectangle);

            System.out.println("Would you like to calculate another Rectangle? Yes or No");
            String YesOrNo = input.next().toLowerCase();

            while ( !(YesOrNo.equals("yes") || YesOrNo.equals("no"))) {
                System.err.println("Invalid Entry, Please Enter Yes or No");
                YesOrNo = input.next().toLowerCase();
            }

            if(YesOrNo.equals("no")){
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                break;
            }

        }
    }

}
/*
Write a program that can calculate the area and perimeter of a Rectangle:
                        1. Ask the user "Enter the length of the Rectangle:"
                                if the user enters 0 or negative numbers,
                                terminate the program after displaying the error message
                                "Invalid Entry for the length of the rectangle"

                        2. Ask the user "Enter the width of the Rectangle:"
                                if the user enters 0 or negative numbers, terminate the
                                program after displaying the error message "Invalid Entry
                                for the width of the rectangle"

                        3. Display:
                                        1. Area of rectangle
                                        2. Perimeter of rectangle

                        4. Ask the user "Would you like to calculate another Rectangle?"
                                        If "yes" --> repeat the previous steps
                           If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

                                If the user enters an invalid entry, ask the user
                                to re-enter until the user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

 */
