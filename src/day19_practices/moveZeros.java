package day19_practices;

import java.util.Arrays;

public class moveZeros {

    public static void main(String[] args) {
        
        int[] array = {10, 0, 5, 0, 1, 0};

        Arrays.sort(array);

        int[] reverse = new int[array.length];
        for (int i = array.length-1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }

        System.out.println(Arrays.toString(reverse));

    }
}

/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */
