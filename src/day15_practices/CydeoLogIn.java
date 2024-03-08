package day15_practices;

import java.util.Scanner;

public class CydeoLogIn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = input.next();

        System.out.println("Enter your password:");
        String password = input.next();

        if(username.equals("Cydeo") && password.equals("Cydeo123")){ // if credentials are correct
            System.out.println("Logged in");
        }else{ // otherwise

            for (int i = 0; i < 3; i++) {
                if( i != 2){
                    System.err.println("Incorrect username or password, please re-enter");
                }else{
                    System.err.println("This is your last chance, Please re-enter your username and password");
                }

                System.out.println("Enter your username:");
                username = input.next();

                System.out.println("Enter your password:");
                password = input.next();

                if(username.equals("Cydeo") && password.equals("Cydeo123")){ // if user enters valid credentials
                    System.out.println("Logged in");
                    break;  // exits the loop
                }
            }
            if( !(username.equals("Cydeo") && password.equals("Cydeo123"))){ // after all three attempts, if username and password still incorrect
                System.err.println("Your account is Locked");
            }
        }
        input.close();
    }
}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your
credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have
                three attempts to enter the correct credentials, and if all three attempts fail,
                then print "Your account is locked."
 */
