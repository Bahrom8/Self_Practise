package day15_practices;

import java.util.Scanner;

public class uniqueCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String:");
        String answer = input.nextLine();
        String result = "";


        for (int i = 0; i < answer.length(); i++) {
            if(answer.indexOf(answer.charAt(i)) == answer.lastIndexOf(answer.charAt(i))){
                result += answer.charAt(i);
            }

        }
        System.out.println(result);


    }
}
/*
Create a class called UniqueCharacters, Write a program that can return the unique
characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD

	            Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are the same,
	                  then it's a unique
 */
