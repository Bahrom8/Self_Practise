package day08_practices;

public class OxygenTanks {
    public static void main(String[] args) {
        int number = 32;
        String number1 = (number >= 50 && number <= 100) ? (number >= 90) ? "Your Tank is full"
                :(number >= 80)? "Still Okay"
                :(number >= 70)? "Don't go too far"
                :(number >= 60)? "Start to head back"
                 : "Be careful now you at 50%" : "not in range";
        System.out.println(number1);



    }
}
/*
Create a class called OxygenTank. You are diving in the ocean.
    Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary
 */
