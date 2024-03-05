package day11_practices;

public class EmailTask2 {

    public static void main(String[] args) {

/*
        String first_name = "Craig";
        String last_name = "Federighi";
        String domain = "apple";

        first_name = first_name.toLowerCase();
        last_name = last_name.toLowerCase();

        System.out.println(first_name + "_" + last_name + "@" + domain + ".com");

 */

        String email = "craig_Federighi@apple.com";

        String first_name = email.substring(0, email.indexOf("_"));
        String last_name = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1 ,email.lastIndexOf("."));

        System.out.println(first_name.toUpperCase().charAt(0) + first_name.substring(1).toLowerCase());
        System.out.println(last_name.toUpperCase().charAt(0) + last_name.substring(1).toLowerCase());
        System.out.println(domain);

    }
}
/*
Create a class called EmailTask2.
   Assume that the email address is constructed by the person's
   first name and followed by an underscore and last name.

   Write a program that will print out information about the
   user based on email. Print first name, last name, and domain.

   First and Last names should be printed in the proper
   format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple

 */
