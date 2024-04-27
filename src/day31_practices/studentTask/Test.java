package day31_practices.studentTask;

public class Test {

    public static void main(String[] args) {

        Student student = new Student("Josh", 26, 'F', "A78", "Developer", "CYDEO", 'A');
        System.out.println(student);
        student.study();

        CydeoStudent cydeoStudent = new CydeoStudent("Bakhrom", 27, 'M', "A07",
                "Java Developer", "Cydeo", 'A', 02, 2,
                "Java" );
        System.out.println(cydeoStudent);

    }

}
