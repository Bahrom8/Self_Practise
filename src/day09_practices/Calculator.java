package day09_practices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter first number");
        double firstNumber = input.nextDouble();
        System.out.println("Enter math operator");
        char operator = input.next().charAt(0);
        System.out.println("Enter second number");
        double secondNumber = input.nextDouble();

        double result = 0;
        if (operator == '+') {
            System.out.println(result = firstNumber + secondNumber);
        } else if(operator == '-'){
            System.out.println(result = firstNumber - secondNumber);
        }else if(operator == '*'){
            System.out.println(result = firstNumber * secondNumber);
        }else if(operator == '/'){
            System.out.println(result = firstNumber / secondNumber);
        }else{
            System.out.println("Invalid Entry");
        }


        }
    }
/*
Create a class named Calculator:
		- Ask the user to enter the first number (double)
		- Ask the user to enter a math operator (char)
		- Ask the user to enter the second number

		- print the calculation result,
		- if the operator is not a valid math operator
		        (+, -, *, /), then print "Invalid entry"
 */
