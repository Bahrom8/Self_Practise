package day24_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDigits {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(); // 0 - 9
        list.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        list.removeIf(p-> (p > 48) && (p < 57));

        System.out.println(list);


    }

}
/*
Write a program that can remove all the digits from an ArrayList of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$', A', 'B', 'C', 'D', '@', '!']

	Note: DO NOT use any loops
 */
