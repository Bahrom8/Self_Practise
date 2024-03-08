package day14_practices;

import javax.swing.text.SimpleAttributeSet;

public class task5_retrieve {
    public static void main(String[] args) {
        retrieve("mn@#123Ab");

    }
    public static void retrieve (String word){
        String letter = "";
        String digit = "";
        String character = "";

        for (int i = 0; i < word.length(); i++) {
            int num = word.charAt(i);
            if((num >= 'A' && num <= 'Z') || (num >= 'a' && num <= 'z')){
                letter += word.charAt(i);
            }else if(num >= '0' && num <= '9'){
                digit += word.charAt(i);
            }else{
                character += word.charAt(i);
            }

        }
        System.out.println("letter = " + letter);
        System.out.println("digit = " + digit);
        System.out.println("character = " + character);
    }
}
/*
write a program that can retrieve the digits,
letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */
