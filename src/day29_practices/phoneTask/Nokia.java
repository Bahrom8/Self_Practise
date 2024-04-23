package day29_practices.phoneTask;

public class Nokia extends PhoneTask {

    public void call(long phoneNumber){
        System.out.println("Calling to " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println("Texting to " + phoneNumber);
    }

    public void selfDefense(){
        System.out.println(getBrand() + " " + getModel() + " has self defense mode");
    }


}
/*
reate a class named Nokia:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand cannot be null/empty/blank
						2. model cannot be null/empty/blank
						3. Color cannot be null/empty/blank
						4. price cannot be zero or negative

				Methods:
					setInfo(): sets the brand to "Nokia" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString(): prints nokia object info when the object is passed in the print statement

 */
