package day23_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class setLastToZero {

    public static void main(String[] args) {

        Integer[] nums = {1, 2, 3, 4, 5};
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(nums));
        list.set(list.lastIndexOf(nums.length), 0);
       // list.set(4,0);
        System.out.println(list);

    }

}
/*
write a program that can set the last element of the Integer ArrayList to zero
            ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,0];
 */
