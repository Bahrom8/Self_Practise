package day26_practices;

import java.text.DecimalFormat;

public class Circle {

    public double radius;
    public double diameter;
    public static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
        diameter = radius * 2;
    }


    public double calArea(){
        return (PI * radius * radius);
    }

    public double calcPerimeter(){
        return (2 * PI * radius);
    }

    public double printPI(){
        return (PI);
    }

    DecimalFormat df = new DecimalFormat("0.00");

    public String toString() {
        return "\n\tCircle" +
                "\nradius: " + df.format(radius) +
                "\ndiameter: " + df.format(diameter)  +
                "\nPI: " + df.format(printPI())  +
                "\nArea of Circle: " + df.format(calArea())  +
                "\nPerimeter of Circle: " + df.format(calcPerimeter());
    }
}
/*
Circle Task:
		1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of the circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays the PI value
					toString(): displays the radius, diameter, pi, area, and perimeter of the circle when the
					 object of a circle is passed in the print statement
 */
