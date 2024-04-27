package day31_practices.studentTask;

public class Student extends Person {
     private String studentID, fieldOfStudy, schoolName;
     private char grade;

    public Student(String name, int age, char gender, String studentID, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setGrade(grade);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy.isEmpty() || fieldOfStudy.isEmpty() || fieldOfStudy == null){
            System.err.println("Field of study can not be empty or blank");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName.isEmpty() || schoolName.isEmpty() || schoolName == null){
            System.err.println("school Name can not be empty or blank");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if( !(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F' )){
            System.err.println("Invalid gender " + grade);
            System.exit(1);
        }
        this.grade = grade;
    }

    public void study(){
        System.out.println(getName() + " is studying" );
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() +
                " name: " + getName() +
                "\nage: " + getAge() +
                "\ngender: " + getGrade() +
                "\nstudentID: " + studentID +
                "\nfieldOfStudy: " + fieldOfStudy +
                "\nschoolName: " + schoolName +
                "\ngrade: " + grade;
    }
}
