package day29_practices.carTask;

public class Toyota {

    public static void main(String[] args) {

        TestCarTask Toyota = new TestCarTask();
        Toyota.setInfo("Honda","Camry", "Grey", 2021, 38000 );
        Toyota.setMake("Toyota");
        System.out.println(Toyota);

    }

}
/*
Create a class named Toyota
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year cannot be zero or negative
						2. price cannot be zero or negative

				Methods:
					setInfo(): sets the make to "Toyota" and rest of the fields will be set based on the given arguments
					toString(): prints Toyota object info when the object is passed in the print statement

 */
