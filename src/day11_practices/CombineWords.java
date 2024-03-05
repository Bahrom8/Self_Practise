package day11_practices;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first word:");
        String firstWord = input.nextLine();
        System.out.println("Enter a second word:");
        String secondWord = input.nextLine();

        char lastCharFirstWord = firstWord.charAt(firstWord.length() - 1);
        char firstCharSecondWord = secondWord.charAt(0);

        if (lastCharFirstWord == firstCharSecondWord){
            System.out.println(firstWord+(secondWord.substring(1)));
        }else {
            System.out.println(firstWord+secondWord);
        }


    }
}
/*
Create a class named CombineWords. Ask the user to enter two words.
Then add them together and print.
    But if the last letter of the first word and the first letter
    of the last letter are the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
 */
