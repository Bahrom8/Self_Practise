package day31_practices.studentTask;

public class UnderGraduateStudent extends Student {

    public UnderGraduateStudent(String name, int age, char gender, String studentID, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentID, fieldOfStudy, schoolName, grade);

    }

    public void study(){
        System.out.println(getName() + " studies as an undergraduate student");
    }

}
