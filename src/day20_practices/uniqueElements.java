package day20_practices;

public class uniqueElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10, 11, 12, 12, 13, 14, 14, 15};
        for (int element : arr) {

            int count = 0;

            for (int each : arr) {
                if (each == element) {
                    count++;
                }
            }

            if(count==1){
                System.out.println(element);
            }


        }


    }
}
/*
Write a program that can display the unique elements of an array

			MUST use for each loop
 */
