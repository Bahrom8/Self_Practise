package day31_practices.employeeTask;

public class Teacher extends Employee {

    public Teacher(String name, String ID,  String companyName, int age, char gender, double salary) {
        super(name, ID, "Teacher", companyName, age, gender, salary);
    }

    public void work(){
        System.out.println(getName() + " is teaching");
    }

}
