package day31_practices.employeeTask;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, String ID, String companyName,
                     int age, char gender, double salary, String programmingLanguage) {
        super(name, ID, "Developer", companyName, age, gender, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void work(){
        System.out.println(getJobTitle() + " " + getName() + " is coding in " + getProgrammingLanguage());
    }

    @Override
    public String toString() {
        return  "\n" + getClass().getSimpleName() +
                " name: " + getName() +
                "\nID: " + getID() +
                "\njob Title: " + getJobTitle() +
                "\ncompany Name: " + getCompanyName() +
                "\nage: " + getAge() +
                "\ngender: " + getGender() +
                "\nsalary: $" + getSalary() +
                "\nProgramming Language: " + getProgrammingLanguage();
    }

}
