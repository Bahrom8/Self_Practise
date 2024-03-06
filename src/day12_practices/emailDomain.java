package day12_practices;

public class emailDomain {

    public static void main(String[] args) {
        String email = domain("Cydeo@gmail.com");
        System.out.println(email);

    }
    public static String domain(String email){
        String domain = email.substring(email.indexOf("@")+1, email.indexOf('.'));

        return domain;
    }
}
/*
Create a method named emailDomain that can display
the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 */
