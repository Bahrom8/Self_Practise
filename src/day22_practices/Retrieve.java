package day22_practices;

public class Retrieve {

    public static void main(String[] args) {

        String str = "Wooden Spoon!",
                letters = "",
                digits = "",
                specialChars = "";
        
        for ( char each : str.toCharArray() ) {
            if (Character.isDigit(each)) {
                digits += each;
            }

            if(Character.isLetter(each)){
                letters += each;
            }

            if(!Character.isLetterOrDigit(each)){
                specialChars += each;
            }
            
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

    }

}
/*
Write a program that can retrieve the letters, digits, and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

        Note: Use Wrapper class methods
 */
