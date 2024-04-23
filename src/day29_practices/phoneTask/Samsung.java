package day29_practices.phoneTask;

public class Samsung extends PhoneTask {

    public void call(long phoneNumber){
        System.out.println("Calling to " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println("Texting to " + phoneNumber);
    }

    public void freeze(){
        System.out.println(getBrand() + " " + getModel() + " frozen");
    }


}
/*
Create a class named Samsung:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand cannot be null/empty/blank
						2. model cannot be null/empty/blank
						3. Color cannot be null/empty/blank
						4. price cannot be zero or negative

				Methods:
					setInfo(): sets the brand to "Samsung" and the rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString(): prints samsung object info when the object is passed in the print statement

 */
