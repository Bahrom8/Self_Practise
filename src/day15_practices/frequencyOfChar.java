package day15_practices;

import javax.script.ScriptContext;
import java.util.Scanner;

public class frequencyOfChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = input.nextLine(); //Java programming language
        System.out.println("Enter a character");
        char ch = input.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if( str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println(count);


    }
}

/*
Create a class named FrequencyOfChar and Write a program that asks the user to enter a string
and a char, which returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */
