package day04_practices;

public class Sqaure {

    public static void main(String[] args) {
        int side = 5;
        int area = (int) Math.pow(side, 2);
        int perimeter = side * 4;

        System.out.println("The are of the square is " + area);
        System.out.println("The perimeter of the square is " + perimeter);


    }
}

/*
5. Create a class named Square and declare the following variables:
                side
                area
                perimeter

    5.1 Write a program that can calculate the area and perimeter of a square with any given  side
        Ex:
              side = 5

        output:
               The area of the square is 25
               The perimeter of the square is 20

 */
