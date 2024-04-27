package day31_practices.employeeTask;

public class Driver extends Employee {

    public Driver(String name, String ID, String companyName, int age, char gender, double salary) {
        super(name, ID, "Driver", companyName, age, gender, salary);
    }

    public void work(){
        System.out.println(getName() + " is driving");
    }

}
