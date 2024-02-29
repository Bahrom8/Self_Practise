package day04_practices;

public class Circle {
    public static void main(String[] args) {
        int radius = 5;
        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;
        String formattedArea = String.format("%.1f", area);
        String formattedPerimeter = String.format("%.1f", perimeter);

        System.out.println("The area of the circle is " + formattedArea);
        System.out.println("The perimeter of the circle is " + formattedPerimeter);


    }
}

    /*
     Variable declaration


        int radius = 5;

        /* Original calculations
        double area = 3.14radius radius,
                perimeter = 23.14radius;
         /

        // Calculations with math functions
        double area = Math.PI Math.pow(radius,2),
                perimeter = 2Math.PI radius;

        // Formatting corrections
        String formattedArea = String.format("%.1f", area),
            formattedPerimeter = String.format("%.1f", perimeter);

         Original Print Statement
        System.out.println("The area of the circle is " + area +
                            "\nThe perimeter of the circle is " + perimeter);


    // Print Statements with formatting functions

        //System.out.println("The area of the circle is " + formattedArea +
            "\nThe perimeter of the circle is " + formattedPerimeter);

     */


/*
6. Create a class named Circle and declare the following variables:
                radius
                area
                perimeter

    6.1 Write a program that can calculate the area and perimeter of a circle with any given radius
            Ex:
                  radius = 5

            output:
                   The area of the circle is 78.5
                   The perimeter of the circle is 31.4

 */


