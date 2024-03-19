package day17_practices;

public class Rectangle {

    public int length;
    public int width;

    public void setRectangleInfo(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        double area = length*width;
        return area;
    }

    public double calculatePerimeter(){
        double perimeter = (length*2)+(width*2);
        return perimeter;
    }

    public String toString() {
        return "Rectangle " +
                "length = " + length +
                ", width = " + width +
                ", area = " + calculateArea() +
                ", perimeter = " + calculatePerimeter();
    }
}
/*
3. create a custom class named Rectangle
        Attributes:
            length, width

        Actions:
            setInfo(): sets the length and width of the rectangle object
            calculateArea(): calculates the area of the rectangle, returns it as double
            calculatePerimeter() calculates the perimeter of the rectangle,
            and returns it as a double
            toString(): when a rectangle object is passed in the print statement
                    it should display the length, width, area, and perimeter of
                    the Rectangle object
 */