package day15_practices;

import java.util.Scanner;

public class divisibleBy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        int i = 1;
        System.out.print("Divisible by 15: ");
        while (i <= num){
            if(i % 15 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();

        int j = 1;
        System.out.print("Divisible by 5: ");
        while (j <= num){
            if(j % 5 == 0 && j % 15 != 0){
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println();

        int k = 1;
        System.out.print("Divisible by 3: ");
        while (k <= num){
            if(k % 3 == 0 && k % 15 != 0){
                System.out.print(k + " ");
            }
            k++;
        }

    }
}
/*
Create a class named DivisibleBy and Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
	            if the number can be divisible by 3, 5, and 15,
	                then it should only be displayed in DivisibelBy15' section

	            if the number can be divisible by 3 but cannot be divisible by 15,
	                then it should only be displayed in DivisibelBy3' section

	            if the number can be divisible by 5 but cannot be divisible by 15,
	                then it should only be displayed in DivisibelBy5' section

	            EX:
	                input: 100

	                Output:
	                     Divisible By 15: 15 30 45 60 75 90

	                     Divisible By 5:  5 10 20 25 35 40 50 55 65 70 80 85 95 100

	                     Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

 */
