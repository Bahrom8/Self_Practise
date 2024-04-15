package day23_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class multiplyOddNumbers {

    public static void main(String[] args) {

        Integer[] list = {1, 2, 3, 4, 5};
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList( list ));

        int odd = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                odd = numbers.get(i) * 2;
                numbers.set(i, odd);
            }
        }
        System.out.println(numbers);
    }
}
/*
write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]

 */
