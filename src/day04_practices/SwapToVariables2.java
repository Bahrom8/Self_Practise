package day04_practices;

public class SwapToVariables2 {

    public static void main(String[] args) {

       int x = 10,
                y = 15;

      // 1st method
       /*
        x = y + x;
        y = x - y;
        x = x - y;
        */

        // 2nd method
        /*
        x = x * y;
        y = x / y;
        x = x / y;
         */

        // 3rd method
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;


        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}

/*
Create a class named SwapTwoVariable21 and declare the following variables:
            x
            y

    9.1 Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 10

 */
