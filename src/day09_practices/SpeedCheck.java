package day09_practices;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int speedLimit = 70;

        System.out.println("Enter your current speed");
        int currentSpeed = input.nextInt();

        if(currentSpeed > speedLimit){
            currentSpeed -= speedLimit;

            System.out.println("You're driving " + currentSpeed +  " mph over the limit. Slow down");
        }


    }

}
/*
Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is given
	Ask the user to enter the current speed, if the current speed is over
	the speed limit then print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down!
 */
