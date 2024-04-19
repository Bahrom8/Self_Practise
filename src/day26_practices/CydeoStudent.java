package day26_practices;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public String ID;
    public char grade;
    public String batchNumber;
    public int groupNumber;

    public static String schoolName = "CYDEO";
    public static String magicWord = "Java is the Best";

    public CydeoStudent(String name, int age, char gender, String ID, char grade, String batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public void attendClass(){
        System.out.println(name + " is attending to class");
    }

    public String printSchoolName(){
        return (schoolName);
    }

    public String printProgrammingLanguage(){
        return (magicWord);
    }

    public String toString() {
        return "\n\tCydeoStudent " +
                "\nname: " + name +
                "\nage: " + age +
                "\ngender: " + gender +
                "\nID: " + ID +
                "\ngrade: " + grade +
                "\nbatchNumber: " + batchNumber +
                "\ngroupNumber: " + groupNumber +
                "\nSchool Name: " + printSchoolName() +
                "\nProgramming Language: " + printProgrammingLanguage();
    }


}
/*
CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgrammingLanguage(): displays the name of the programming language
					toString()

 */
