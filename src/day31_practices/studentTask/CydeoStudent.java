package day31_practices.studentTask;

public class CydeoStudent extends Student{

    private int batchNumber, groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, char gender, String studentID, String fieldOfStudy, String schoolName, char grade, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentID, fieldOfStudy, schoolName, grade);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber <= 0){
            System.out.println("Invalid batch number " + batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if(groupNumber <= 0){
            System.out.println("Invalid group number " + groupNumber);
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage == null || programmingLanguage.isEmpty()){
            System.err.println("Invalid programming language " + programmingLanguage);
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }


    public void eat() {
        System.out.println(getName() + " student is eating food");
    }


    public void drink() {
        System.out.println(getName() + " student is drinking water");
    }


    public void sleep() {
        System.out.println(getName() + " student is sleeping");
    }

    public String toString() {
        return "\n" + getClass().getSimpleName() +
                " name: " + getName() +
                "\nage: " + getAge() +
                "\ngender: " + getGrade() +
                "\nstudent ID: " + getStudentID() +
                "\nfield Of Study: " + getFieldOfStudy() +
                "\nschool Name: " + getSchoolName() +
                "\ngrade: " + getGrade() +
                "\nbatch Number: " + getBatchNumber() +
                "\ngroup Number: " + getGroupNumber() +
                "\nprogramming language: " + getProgrammingLanguage();

    }

}
