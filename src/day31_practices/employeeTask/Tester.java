package day31_practices.employeeTask;

public class Tester extends Employee {

    public Tester(String name, String ID,  String companyName, int age, char gender, double salary) {
        super(name, ID, "Tester", companyName, age, gender, salary);
    }

    public void work(){
        System.out.println(getJobTitle() + " " + getName() + " is testing" );
    }

}
