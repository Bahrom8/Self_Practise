package day31_practices.employeeTask;

public class Employee {

    private String name, ID, jobTitle, companyName;
    private int age;
    private char gender;
    private double salary;

    public Employee(String name, String ID, String jobTitle, String companyName, int age, char gender, double salary) {
        setName(name);
        setID(ID);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setAge(age);
        setGender(gender);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isEmpty() || name == null){
            System.err.println("Name can not be empty or blank");
            System.exit(1);
        }

        String specialChars = "";

        for (char each : name.toCharArray()) {
            if(!Character.isLetterOrDigit(each) && each != ' '){  // getting all special character except for space
                specialChars += each;
            }
        }

        if(specialChars.length() > 0){ // if contains special characters other than space
            System.err.println("Invalid Name: " + name);
            System.exit(1);
        }

        if(!Character.isLetter(name.charAt(0))){ // if name does not start with letter
            System.err.println("Invalid Name: " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            return;
        }
        if(age < 18){
            System.err.println("Valid age is 18, sorry you are not an eligible to work");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if( !(gender == 'M' || gender == 'F') ){
            System.err.println("Invalid gender " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0 ){
            System.err.println("Salary cannot be negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working");
    }

    public String toString() {
        return "\n" + getClass().getSimpleName() +
                " name: " + name +
                "\nID: " + ID +
                "\njob Title: " + getClass().getSimpleName() +
                "\ncompany Name: " + companyName +
                "\nage: " + age +
                "\ngender: " + gender +
                "\nsalary: $" + salary;
    }


}
