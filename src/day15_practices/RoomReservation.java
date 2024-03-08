package day15_practices;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.println("Do you want to reserve a room? Yes/No");
        String answer = input.nextLine().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.out.println("Please re-enter your answer, Yes or No?");
            answer = input.nextLine().toLowerCase();
        }
        if (answer.equals("no")) {
            System.out.println("Have a nice day!");
        }
        System.out.println("Which type of room do you want to reserve? \n\tKing Bed ==> 120$ \n\tQueen Bed ==> 100$" +
                "\n\tSingle Bed ==> 80$");
        answer = input.nextLine().toLowerCase();

        int kingPrice = 120,
                queenPrice = 100,
                singlePrice = 80;

        int totalPrice = 0;

        while (!(answer.equals("king bed") || answer.equals("queen bed") || answer.equals("single bed"))) {
            System.err.println("Invalid selection! Please re-enter valid room type");
            answer = input.nextLine().toLowerCase();
        }

        switch (answer) {
            case "king bed":
                System.out.println("You selected King Bed, and your total price is: \n$" + kingPrice);
                break;
            case "queen bed":
                System.out.println("You selected queen bed, and your total price is: \n$" + queenPrice);
                break;
            case "single bed":
                System.out.println("You selected single bed, and your total price is: \n$" + singlePrice);
                break;
            default:
                System.out.println("Please select a valid room type!");
        }
    }

}

/*
Create a class called RoomReservation, and write a program for the room reservation;
your program asks the user if they want to reserve a room.
    	if the user enters yes, then ask which type of room the user wants to reserve.
    	if the user entered no, print "Have a nice day"
    			(if the user entered any invalid answer (other than yes/no) ask the user
    			to reenter until the user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and the total
            price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until
            the user provides a valid entry)
 */
