package day16_practices;

import java.util.Scanner;

public class task8_RoomReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.println("What kind of room do you want to reserve?");
            System.out.println("King Bed is $120 \nQueen Bed is $100 \nSingle Bed is $80");
            String bed = input.nextLine().toLowerCase();
            System.out.println("How many nights do you want to stay?");
            int nights = input.nextInt();
            input.nextLine();

            while( !( bed.equals("king bed") || bed.equals("queen bed") || bed.equals("single bed"))){
                System.err.println("Invalid Entry, Please Enter valid room type");
                bed = input.nextLine().toLowerCase();
            }

            int kingBed = 120,
                    queenBed = 100,
                    singleBed = 80;

            if( bed.equals("king bed") ){
                System.out.println("King Bed $" + kingBed * nights );
            }else if( bed.equals("queen bed") ){
                System.out.println("Queen Bed $" + queenBed * nights);
            }else{
                System.out.println("Single Bed $" + singleBed * nights);
            }

            System.out.println("Would you like to reserve another room? Yes or No");
            String answer = input.nextLine().toLowerCase();

            while ( !(answer.equals("yes") || answer.equals("no"))  ){
                System.err.println("Invalid entry, Please enter yes or no");
                answer = input.nextLine().toLowerCase();
            }
            if( answer.equals("no") ){
                System.out.println("Thank you reserving room with us!");
                break;
            }
        }
    }
}
/*
Create a class called RoomReservation, and write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom he/she wants to reserve and how many nights he/she is staying.
            Then Ask the user "Would you like to reserve another room?"
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            If the user enters any invalid entry,  ask the user to re-enter until the user provides a valid entry

 */
