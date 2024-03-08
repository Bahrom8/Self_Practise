package day15_practices;


import java.util.Scanner;

public class task2_positiveNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number:");
            int num = input.nextInt();

            if (num > 0) {
                positiveCount++;
            }
            if (num < 0) {
                negativeCount++;
            }

        }

        System.out.println(positiveCount + " positive " + negativeCount + " negative" );



    }
}
/*
Create a class named PositiveNegative and write a program that asks the user to
enter a number for 5 times, and print how many positive and negative numbers the user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */
