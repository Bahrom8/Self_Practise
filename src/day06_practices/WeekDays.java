package day06_practices;

public class WeekDays {
    public static void main(String[] args) {

        int d = 7;
        String result = "";

        if(d == 1){
            result = "Monday";
        }
        if(d == 2) {
            result = "Tuesday";
        }
        if(d == 3) {
            result = "Wednesday";
        }
        if(d == 4) {
            result = "Thursday";
        }
        if(d == 5) {
            result = "Friday";
        }
        if(d == 6) {
            result = "Saturday";
        }
        if(d == 7) {
            result = "Sunday";
        }
        System.out.println(result);

    }
}
/*
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given,
    Write a program that can print the name of the day that the number represents
            Ex: Given:
            number = 1
            output: Monday
            Hint: Assume that a number between 1 ~ 7 is given to the variable

 */
