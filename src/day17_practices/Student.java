package day17_practices;

public class Student {

    public String name;
    public char gender;
    public int age;
    public String studentId;
    public char grade;
    public boolean isFullTime;

    public void setStudentInfo(String name, char gender, int age, String id, char grade, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentId = id;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Student " +
                "name = '" + name + '\'' +
                ", gender = " + gender +
                ", age = " + age +
                ", studentId = '" + studentId + '\'' +
                ", grade = " + grade +
                ", isFullTime = " + isFullTime;
    }
}
/*
2. Create a custom class named Student
        Attributes:
            name, gender, age, studentId, grade, isFullTime

        Actions:
            setInfo(): sets all the fields of the student object
            toString(): when a car object is passed in a print statement,
                    it should display all the information of the student object
            study()
 */