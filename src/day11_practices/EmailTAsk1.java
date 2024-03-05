package day11_practices;

public class EmailTAsk1 {
    public static void main(String[] args) {


        String email = "mike_tyson@gmail.com";
        String fullName = "miketyson@gmail.com";

        String first_name = email.substring(0, email.indexOf("_"));
        String last_name = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String rest = email.substring(email.indexOf("@"));

        /*
        System.out.println("first_name = " + first_name);
        System.out.println("last_name = " + last_name);
        System.out.println("rest = " + rest);

         */

        email = last_name + "_" + first_name + rest;

        if(email.contains("_")){
            System.out.println(email);
        }else{
            System.out.println(fullName);
        }
    }
}
/*
Create a class called EmailTask1.
   Assume that the email address is constructed by the
   person's first name and followed by an underscore and last name.

    Write a program that can swap the first name with the
    last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
 */
