package day23_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class duplicateElements {

    public static void main(String[] args) {

        Integer[] list = {1, 2, 3, 4, 5};
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(list));

        numbers.addAll(numbers.size(),numbers);

        System.out.println(numbers);




    }

}
/*
Write a program that can duplicate the elements of an ArrayList
		 	ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];
 */
