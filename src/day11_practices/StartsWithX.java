package day11_practices;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");

        String word = input.nextLine();
        String result = "";

        if(word.contains("x") || word.contains("X")){
            result = word.toLowerCase().replaceFirst("x","a").replaceFirst("X","a");
        }else{
            System.out.println("Word has no any 'x'  or 'X' ");
        }
        System.out.println(result);
        input.close();

    }
}

/*
Create a class named StartsWithX and write a program that asks
the user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */
