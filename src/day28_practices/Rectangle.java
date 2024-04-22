package day28_practices;

public class Rectangle {

    private double width, length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.err.println("Invalid width: " + width);
            System.exit(1);
        }

        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.err.println("Invalid length: " + length);
            System.exit(1);
        }

        this.length = length;
    }

    public double calcArea(){
        return (length * width);
    }

    public double calcPerimeter(){
        return (2 * (length + width) );
    }

    public String toString() {
        return "\n\tRectangle" +
                "\nwidth: " + getWidth() +
                "\nlength: " + getLength() +
                "\nArea of Rectangle: " + calcArea()  +
                "\nPerimeter of Rectangle: " + calcPerimeter();
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2,5);
        System.out.println(rectangle);

    }

}
/*Create a class named Rectangle:
        Private variables:
            width, length

        Encapsulate all the fields.
                Conditions:
                    width of the rectangle should not be negative
                    length of the rectangle should not be negative

        Add a constructor that allows the user to set all the fields when the object is created.
                (If the arguments are not valid, they should not be set to the instances)

        Methods:
            calcArea(): returns the area of the rectangle
            calcPerimeter(): returns the perimeter of the rectangle
            toString(): can display the width, length, area, and perimeter of the rectangle
            when the object is passed in the print statement
 */
