package day14_practices;

public class task4_loop {
    public static void main(String[] args) {

        factorial(5);


    }
    public static void factorial(int num){

        int factorial_number = num;

        for (int i = 1; i < num; i++) {
            factorial_number *= i;

            System.out.println(factorial_number);

        }

    }

}
/*
Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */

