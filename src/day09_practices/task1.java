package day09_practices;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people they live with? ");
        int countOfPeople = input.nextInt();

        String result = "Invalid people count. Please insert a number between 1 to 10";

        if (countOfPeople >= 1 && countOfPeople <= 10) {
            if (countOfPeople < 3) {
                result = "Live with less than 3 people";
            } else if (countOfPeople < 6) {
                result = "Live with 3 -6 people";
            } else {
                result = "Live with more than 6 people";
            }
        }
        System.out.println(result);

    }
}
/*
1. Ask the user how many people they live with:
            if the user lives with fewer than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"


 */
