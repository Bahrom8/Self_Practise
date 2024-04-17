package day24_practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class secondMaxAndMin {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));

        int max = Collections.max(list),
                min = Collections.min(list);

        list.removeIf(p -> p == max);
        list.removeIf(p -> p == min);

        System.out.println("The second maximum: " + Collections.max(list));
        System.out.println("The second minimum: " + Collections.min(list));


    }
}
/*
Write a program that can display the second maximum and minimum numbers from an ArrayList of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			The second maximum number is 7
			The second minimum number is 1

	Note: DO NOT use any loops
 */
