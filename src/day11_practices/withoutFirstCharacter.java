package day11_practices;

import java.util.Scanner;

public class withoutFirstCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a first word:");
        String word1 = input.nextLine();
        System.out.println("Enter a second word:");
        String word2 = input.nextLine();

        System.out.println(word1.substring(1) + word2.substring(1));

        input.close();


    }
}
/*
Create a class named WithoutFirstChar. Ask the user to enter two words.
Print the first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */
