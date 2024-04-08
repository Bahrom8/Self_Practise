package day22_practices;

public class lowersEqualsToUppers {

    public static void main(String[] args) {

        String str = "JAVA java";
              int  lowerCase = 0,
                    upperCase = 0;
        boolean isEqual = true;


        for ( char each : str.toCharArray() ){
            if (Character.isUpperCase(each)){
                upperCase++;
            }

            if (Character.isLowerCase(each)){
                lowerCase++;
            }

            if(upperCase == lowerCase){
                isEqual = true;
            }

        }

        System.out.println("isEqual = " + isEqual);

    }

}
/*
Write a program that returns true if the total number of uppercase
characters is equal to the total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true

        Note: Use Wrapper class methods
 */
