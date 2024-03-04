package day09_practices;

import java.util.Scanner;

public class CentsToDollar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter cents");
        int cent = input.nextInt();
        int dollars = cent/100;
        int cents = cent%100;

        System.out.println(cent + " cents equal to " + dollars + " dollars and " + cents + " cents");



    }
}
/*
Create a class named CentsToDollars, and write a program
that can convert cents to dollars
	if there is any remainder include them in the result of cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to 2 dollars and 25 cents
 */
