package day11_practices;

import java.util.Scanner;

public class ReallyNeverMind {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");

        String result = "";
        String word = input.nextLine();

        if(word.endsWith("ly") || (word.endsWith("LY"))){
            result = "really???";
        }else{
            result = "never mind";
        }
        System.out.println(result);
        input.close();
    }
}
/*
Create a class named ReallyNeverMind. Ask the user to enter a word.
If the word ends with "ly", print "really???",  otherwise, print "never mind"
 */
