package day22_practices;

import java.util.ArrayList;
import java.util.List;

public class Combine {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> combine = new ArrayList<>();

        combine.addAll(List.of(arr1));
        combine.addAll(List.of(arr2));

        System.out.println(combine);

    }

}
/*
write a program that can combine two String arrays into one ArrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
