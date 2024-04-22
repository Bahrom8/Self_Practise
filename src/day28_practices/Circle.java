package day28_practices;

import java.text.DecimalFormat;

public class Circle {

    private double radius;
    public static double PI = Math.PI;

    public Circle(int radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius <= 0){
            System.err.println("Invalid radius: " + radius);
            System.exit(1);
        }

        this.radius = radius;
    }

    public double diameter(){
        return (radius * 2);
    }

    public double calArea(){
        return (PI * radius * radius);
    }

    public double calcPerimeter(){
        return (2 * PI * radius);
    }

    DecimalFormat df = new DecimalFormat("0.00");

    public String toString() {
        return "\n\tCircle" +
                "\nradius: " + df.format(getRadius()) +
                "\ndiameter: " + df.format(diameter())  +
                "\nArea of Circle: " + df.format(calArea())  +
                "\nPerimeter of Circle: " + df.format(calcPerimeter());
    }

    public static void main(String[] args) {

        Circle circle = new Circle(0);
        System.out.println(circle);


    }

}
/*
Create a class named Circle

        Private variables:
            radius

        Public variable:
            pi

         Encapsulate all the private fields.

                 1. The radius of the circle can not be zero or negative

         Add a constructor that can set the radius of a circle when a circle object is created
                 (If the arguments are not valid, it should not be set to the instances)

         Methods:
             calcArea()
             calcPerimeter()
             toString(): displays the radius, area, and perimeter of the circle
             when the circle object is passed in the print statement

 */
