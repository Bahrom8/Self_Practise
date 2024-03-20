package day20_practices;

public class EvenAndOddNumber {
    public static void main(String[] args) {

        int[] num = {7, 98, 152, 3, 71, 120, 59, 88, 1048};

        int countOdd = 0,
                countEven = 0;

        for (int even : num) {
            if( even % 2 == 0){
               countEven++;
            }
        }

        for (int odd : num) {
            if( odd % 2 != 0){
                countOdd++;
            }
        }

        System.out.println("Total Odd number is " + countOdd);
        System.out.println("Total Even number is " + countEven);
    }
}
/*
    Write a program that can count the even and odd numbers from an array of integers

                Note: MUST use for each loop
 */
