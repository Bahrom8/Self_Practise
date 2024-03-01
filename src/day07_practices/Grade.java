package day07_practices;

public class Grade {

            public static void main(String[] args) {

                char grade = 'A';

                String gradeResult = "";

                if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F'){
                    if (grade == 'A'){
                        gradeResult = "Excellent";
                    } else if (grade == 'B') {
                        gradeResult = "Great Job";
                    } else if (grade == 'C') {
                        gradeResult = "Good";
                    } else if (grade == 'D') {
                        gradeResult = "Passed";
                    } else {
                        gradeResult = "Failed";
                    }
                } else {
                    gradeResult = "Invalid";
                }

                System.out.println(gradeResult);

            }

        }
/*
a char variable named Grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            Otherwise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
