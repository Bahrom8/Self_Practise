package day12_practices;

public class capitalization {

    public static void main(String[] args) {

        String name = capitalization("cyDeo", "sCHool");
        System.out.println(name);
    }

    public static String capitalization (String firstName, String lastName) {
        firstName = firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase();
        lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();

        return firstName + " " + lastName;
    }


}

/*
Create a method named capitalization that can format the
first and last names of the person and display the full name of the person

    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School

 */

