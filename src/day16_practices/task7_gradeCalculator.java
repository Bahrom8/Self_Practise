package day16_practices;

import java.util.Scanner;

public class task7_gradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.println("Enter your score:");
            int score = input.nextInt();

                if (score >= 90 && score <= 100) {
                    System.out.println("Grade: A");
                } else if (score >= 80 && score <= 89) {
                    System.out.println("Grade: B");
                } else if (score >= 70 && score <= 79) {
                    System.out.println("Grade: C");
                } else if (score >= 60 && score <= 69) {
                    System.out.println("Grade: D");
                } else if(score >= 0 && score <= 59) {
                    System.out.println("Grade: F");
                }else{
                    System.err.println("Invalid entry");
                    System.exit(1);
                }


            System.out.println("Would you like to enter another score? Yes or NO");
            String answer = input.next().toLowerCase();

            while ( !(answer.equals("yes") || answer.equals("no")) ){
                System.err.println("Invalid entry, Please enter Yes or No");
                answer =input.next().toLowerCase();
            }

            if(answer.equals("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }
        }
    }
}
/*
Write a program for the grade calculator:
                        1. Ask the user to "Enter your score"
                                If user enters an invalid score, terminate the program after displaying
                                the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If the user enters an invalid entry, terminate the program after
                                displaying the error message "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program
 */
