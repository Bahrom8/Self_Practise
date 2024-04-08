package day22_practices;

import java.util.Arrays;

public class Insert {

    public static Integer[] insert(Integer[] array, Integer index, Integer element) {
        Integer[] arr = Arrays.copyOf(array, array.length + 1);
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
            arr[index] = element;
        return arr;
    }

    public static Double[] insert(Double[] array, Integer index, Double element) {
        Double[] arr = Arrays.copyOf(array, array.length + 1);
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
            arr[index] = element;
        return arr;
    }

    public static Character[] insert(Character[] array, Integer index, Character element) {
        Character[] arr = Arrays.copyOf(array, array.length + 1);
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
            arr[index] = element;
        return arr;
    }

    public static String[] insert(String[] array, Integer index, String element) {
        String[] arr = Arrays.copyOf(array, array.length + 1);
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
            arr[index] = element;
        return arr;
    }
    

    public static void main(String[] args) {

        Integer[] arr1 = {10, 20, 30, 40, 50};
        Double[] arr2 = {1.5, 20.5, 30.5, 405.5, 5.5};
        Character[] arr3 = {'!', '@', '#', '$', '%'};
        String[] arr4 = {"Java", "Python", "C#", "JavaScript", "YouTube"};

        System.out.println(Arrays.toString(insert (arr1,2,100) ) );

        System.out.println(Arrays.toString(insert (arr2, 1, 50.5 ) ) );

        System.out.println(Arrays.toString(insert (arr3,3,'*') ) );

        System.out.println(Arrays.toString(insert (arr3,4,'*') ) );

        System.out.println(Arrays.toString(insert (arr4, 5, "Java is Best" ) ) );

    }

}
 /*
 3. Insert Task:
        1.1 Create a method named insert that passes three parameters:
        integer array, integer index, and integer element. the method inserts
        the given element into the given index of the array and returns the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}

        1.2 Create the same function for double array, char array, and string array

*/