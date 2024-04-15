package day23_practices;

import java.util.ArrayList;

public class CharDigitLetter {

    public static void main(String[] args) {


        String str = "ABCD123$%#@&456EFG!";
        char[] ch = str.toCharArray();


        ArrayList<Character> list1 = new ArrayList<>();
        //list1.addAll(Arrays.asList(str));

        ArrayList<Character> list2 = new ArrayList<>();
        //list2.addAll(Arrays.asList(Integer.valueOf(str)));

        ArrayList<Character> list3 = new ArrayList<>();
        //list3.addAll(Arrays.asList(ch));

        for (char each : ch) {
            if (Character.isLetter(each)){
                list1.add(each);
            }
            if(Character.isDigit(each)){
                list2.add(each);
            }
            if(!Character.isLetterOrDigit(each)) {
                list3.add(each);
            }

        }

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("list3: " + list3);


    }

}
/*
Write a program that can extract the special characters, digits, and letters
from a string and store them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */
