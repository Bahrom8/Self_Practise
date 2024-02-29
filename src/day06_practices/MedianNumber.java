package day06_practices;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10,
                b = 15,
                c = 20;

        String median = " is the median number.";

        if (( a < b && b < c) || (c < b && b <a)){
            median = b + median;
        }
        if ((b < a && a < c) || (c < a && a < b)){
            median = a + median;
        }
        if ((a < c && c < b) || (b < c && c <a)){
            median = c + median;
        }

        System.out.println(median);

    }
}
/*
1. Create a class named MedianNumber.
write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

 */
