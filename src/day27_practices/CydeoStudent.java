package day27_practices;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public String batchNumber;
    public int groupNumber;
    public String fieldOfStudy;
    public String programmingLanguage;

    public static String schoolName;
    public static String secretWord;

    static {
        schoolName = "CYDEO";
        secretWord = "Java is the Best";
    }

    public CydeoStudent(String name, int age, char gender, String batchNumber,
                        int groupNumber, String fieldOfStudy, String programmingLanguage) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
        this.programmingLanguage = programmingLanguage;
    }

    public void printSchoolName(){
        System.out.println(schoolName);
    }

    public void printSecretWord(){
        System.out.println(secretWord);
    }
    public void attendClass(){
        System.out.println(name + " is attending to class");
    }
    public void study(){
        System.out.println(name + " is studying");
    }



    public String toString() {
        return "\n\tCydeoStudent " +
                "\nSchool name: " + schoolName +
                "\nname: " + name +
                "\nage: " + age +
                "\ngender: " + gender +
                "\nbatchNumber: " + batchNumber +
                "\ngroupNumber: " + groupNumber +
                "\nfield of Study: " + fieldOfStudy +
                "\nProgramming Language: " + programmingLanguage +
                "\nSecret word: " + secretWord;
    }

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Bakhrom", 26,
                'M', "JD02",2,
                "Java Developer", "Java");

        System.out.println(student1);

        student1.study();
        student1.attendClass();
        student1.printSchoolName();
        student1.printSecretWord();

    }

}
/*
create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy,
                programmingLanguage, secretCode

            Add a constructor to initialize all the fields.

            Add a static block to initialize all the statics.

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */
