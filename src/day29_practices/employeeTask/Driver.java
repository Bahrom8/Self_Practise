package day29_practices.employeeTask;

public class Driver extends EmployeeTask {



    public static void main(String[] args) {

            EmployeeTask Driver = new EmployeeTask();
            Driver.setInfo("Daneil", "A87", "Driver", 28, 'M', 80000);

            System.out.println(Driver);
            Driver.driving();
    }




}
/*
 Create a custom Class named Driver
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age cannot be nagative
					3. age MUST be between 18 to 65
					4. salary cannot be negative

			Methods:
				setInfo(): sets all the fields
				driving()
				toString(): prints driver object info when the object is passed in the print statement
 */
