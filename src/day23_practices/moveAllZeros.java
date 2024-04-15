package day23_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class moveAllZeros {

    public static void main(String[] args) {

        Integer[] list = {1, 0, 2, 0, 3, 0, 4, 0};
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList( list ));

        for (int i = numbers.size() - 1; i >= 0; i--) {
            if(numbers.get(i) == 0){
                numbers.remove(i);
                numbers.add(0);
            }
        }
        System.out.println(numbers);

    }

}
/*
Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]
 */
