package day11_practices;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");

        String result = "";
        String word = input.nextLine();

        if(word.contains("x") || word.contains("X")){
            result = word.toLowerCase().replaceAll("x", "a").replaceAll("X","a");
        }else{
            result = word;
        }
        System.out.println(result);

        input.close();
    }


}
/*
Create a class named ReplaceX, and write a program that asks the user to enter a word. and replace all the x or X with the character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */
