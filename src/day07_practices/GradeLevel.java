package day07_practices;

public class GradeLevel {
    public static void main(String[] args) {

                byte grade = 15;

                String gradeLevel = "";

                if(grade >= 1 && grade <= 18){
                    if (grade <= 5){
                        gradeLevel = "Elementary School";
                    } else if (grade <= 8) {
                        gradeLevel = "Middle School";
                    } else if (grade <= 12) {
                        gradeLevel = "High School";
                    } else if (grade <= 16) {
                        gradeLevel = "College";
                    } else {
                        gradeLevel = "Grad School";
                    }
                } else {
                    gradeLevel = "Invalid Grade Level"+
                            "\nGrade must be between 1-18";
                }

                System.out.println(gradeLevel);

            }

        }
/*
Given a number(byte) grade level, determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */