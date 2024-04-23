package day29_practices.carTask;

public class Honda {
    public static void main(String[] args) {

        TestCarTask Honda = new TestCarTask();
        Honda.setInfo("", "Accord", "White",2022, 25000);
        Honda.setMake("Honda");
        System.out.println(Honda);


    }

}
/*
Create a class named Honda
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year cannot be zero or negative
						2. price canot be zero or negative

				Methods:
					setInfo(): sets the make to "Honda" and rest of the fields will be set based on the given arguments
					toString(): prints toyota object info when the object is passed in the print statement
 */
