package day24_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class removeCountryName {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Switzerland", "Canada", "Kazakhstan",
                "USA", "Australia", "Uzbekistan", "England", "Turkey"));

        list.removeIf(p-> p.length() >= 10);

        System.out.println(list);



    }
}
/*
Create an ArrayList of strings called country names,
and write a program that can remove all the country names that have lengths of 10 or greater
 */
