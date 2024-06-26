package day24_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class removeStringElements {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        list.removeIf(p-> p.toLowerCase().charAt(0)==p.charAt(p.length()-1));

        System.out.println(list);

    }
}
/*
Write a program that can remove string elements from an ArrayList if the
first and last characters of the string are the same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		["Lan", "Ebrahim", "Farida"]
 */
