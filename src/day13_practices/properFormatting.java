package day13_practices;

public class properFormatting {
    public static void main(String[] args) {

        System.out.println(properFormatting("muHTAR is Cool"));
    }
    public static String properFormatting(String title) {

        title = title.toUpperCase().charAt(0) + title.substring(1).toLowerCase();

        return title;
    }

}
/*
Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java

 */
