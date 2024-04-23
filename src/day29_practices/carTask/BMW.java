package day29_practices.carTask;


public class BMW {
    public static void main(String[] args) {

        TestCarTask BMW = new TestCarTask();
        BMW.setInfo("", "XB 7 Alpina", "Black", 2024, 70000);
        BMW.setMake("BMW");
        System.out.println(BMW);

    }
}
/*
Create a class named BMW
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year cannot be zero or negative
						2. price cannot be zero or negative

				Methods:
					setInfo(): sets the make to "BMW" and rest of the fields will be set based on the given arguments
					toString(): prints bmw object info when the object is passed in the print statement
 */

