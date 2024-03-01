package day07_practices;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 165;

        String ageGroup;

        if(age > 0 && age <= 150){
            if (age <= 21){
                ageGroup = "Teenager";
            } else if (age <= 55) {
                ageGroup = "Adult";
            } else {
                ageGroup = "Senior";
            }
        } else {
            ageGroup = "Invalid";
        }

        System.out.println(ageGroup);

    }

}
/*
write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if the age is negative or greater than 150, print "invalid"

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */


