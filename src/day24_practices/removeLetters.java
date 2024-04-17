package day24_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class removeLetters {

    public static void main(String[] args) {


        ArrayList<Character> list = new ArrayList<>(); // 0 - 9
        list.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        list.removeIf(p-> (p > 65) && (p < 90));

        System.out.println(list);


    }
}
/*
Write a program that can remove all the letters from an ArrayList of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$',  '1', '2', '@', '!', '3', '4']
 */
