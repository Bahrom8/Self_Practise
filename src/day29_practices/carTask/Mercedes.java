package day29_practices.carTask;

public class Mercedes {
    public static void main(String[] args) {

        TestCarTask Mercedes = new TestCarTask();
        Mercedes.setInfo("", "S class", "Black", 2020, 70000);
        Mercedes.setMake("Mercedes Benz");
        System.out.println(Mercedes);


    }
}
/*
Create a class named Mercedes
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year cannot be zero or negative
						2. price cannot be zero or negative

				Methods:
					setInfo(): sets the make to "Mercedes" and rest of the fields will be set based on the given arguments
					toString(): prints mercedes object info when the object is passed in the print statement

 */
