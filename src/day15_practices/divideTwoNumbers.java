package day15_practices;

import java.util.Scanner;

public class divideTwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1 = input.nextInt();
        System.out.println("Enter your second number:");
        int num2 = input.nextInt();

        int result = 0;

        while (num1 >= num2){   //num1 = 10 - 2
            num1 -= num2;       // num = 8, 6, 4, 2, 0

            result++;           //result = 1 + 1 + 1 + 1 + 1 = 5
        }
        System.out.println("Result: " + result);

    }
}

/*
Create a class named DivideTwoNumbers and Write a program that can divide
two positive numbers without using / (division) and * (multiplication) operators.

 */