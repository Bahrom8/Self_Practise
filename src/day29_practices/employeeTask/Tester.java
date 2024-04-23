package day29_practices.employeeTask;

public class Tester {

    private String name, ID, jobTitle;
    private int age;
    private char gender;
    private double salary;


    public void setInfo (String name, String ID, String jobTitle,
                         int age, char gender, double salary) {
        setName(name);
        setID(ID);
        setJobTitle(jobTitle);
        setAge(age);
        setGender(gender);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.err.println("Invalid age");
            System.exit(1);
        }
        if(age < 18 || age > 65){
            System.err.println("Invalid student age " + age);
            System.exit(1);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender == 'M' || gender == 'F'){
            this.gender = gender;
        }else{
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            System.err.println("Salary cannot be negative");
            System.exit(1);
        }
        this.salary = salary;
    }


    public void testing(){
        System.out.println(name + " is testing");
    }

    public String toString() {
        return getClass().getSimpleName() +
                "\nname: " + name +
                "\nID: " + ID +
                "\njobTitle: " + jobTitle +
                "\nage: " + age +
                "\ngender: " + gender +
                "\nsalary: $" + salary;
    }





}
/*
1. Create a custom Class named Tester
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age cannot be negative
					3. age MUST be between 18 to 65
					4. salary cannot be negative

			Methods:
				setInfo(): sets all the fields
				testing()
				toString(): prints tester object info when the object is passed in the print statement

 */
