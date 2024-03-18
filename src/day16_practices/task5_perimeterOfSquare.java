package day16_practices;

import java.util.Scanner;

public class task5_perimeterOfSquare {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.println("Enter the side of the square:");
            double num = input.nextDouble();

            if( num <= 0){
                System.err.println("Invalid Entry for the side of the square");
                System.exit(1);
            }

            double areaOfSquare = num * num;
            double perimeterOfSquare = 4 * num;

            System.out.println("Area Of Square is: " + areaOfSquare);
            System.out.println("Perimeter Of Square is: " + perimeterOfSquare);

            System.out.println("Would you like to calculate another Square? Yes/No");
            String YesOrNo = input.next().toLowerCase();

            while ( !(YesOrNo.equals("yes") || YesOrNo.equals("no"))){
                System.err.println("Invalid entry, Please enter \"yes\" or \"no\" ");
                YesOrNo = input.next().toLowerCase();
            }

            if(YesOrNo.equals("no")){
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }


        }

    }
}
/*
Write a program that can calculate the area and perimeter of a Square:
     1. Ask the user "Enter the side of the square:"
        if the user enters 0 or negative numbers, terminate the program after
        displaying the error message "Invalid Entry for the side of the square"

     2. Display:
           1. Area of square
           2. Perimeter of square

     3. Ask the user "Would you like to calculate another Square?"
               If "yes" --> repeat the previous steps
               If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

                  if the user enters an invalid entry, ask the user to
                  re-enter until the user provides a valid entry

               Hint: you can use  System.exit(1) to terminate the entire program

 */
