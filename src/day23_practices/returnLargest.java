package day23_practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class returnLargest {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));

        int n = 5;
        for (int i = 1; i < n; i++) {
            numbers.removeIf(p -> Collections.max(numbers) == p);
        }

        System.out.println(Collections.max(numbers));


    }
}
/*
write a program that can return the nth largest number from an ArrayList
            ex:
	            ArrayList = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
 */
