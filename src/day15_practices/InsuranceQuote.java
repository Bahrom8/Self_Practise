package day15_practices;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.next();
        System.out.println("Enter your gender:");
        char gender = input.next().toLowerCase().charAt(0);

        while (!(gender == 'm' || gender == 'f')) {
            System.err.println("Please Enter valid Gender, try again:");
            gender = input.next().toLowerCase().charAt(0);
            }

        System.out.println("Are you married? Yes/No");
        String yes_no = input.next().toLowerCase();
        while (!(yes_no.equals("yes") || yes_no.equals("no"))) {
            System.err.println("Please Enter valid answer, try again:");
            yes_no = input.next().toLowerCase();
            }

        System.out.println("Enter your age:");
        int age = input.nextInt();
        while (age > 120 || age <= 0) {
            System.err.println("Please try again and enter valid age");
            age = input.nextInt();
            }

        System.out.println("How many miles you will be drive in a day:");
        double mile = input.nextDouble();
        while (mile < 5) {
            System.err.println("Please try again and enter valid mileage");
            mile = input.nextDouble();
            }

        System.out.println("Do you want full coverage or liability insurance: ");
        String coverage = input.next();
        while (!(coverage.equals("full") || coverage.equals("liability"))) {
            System.err.println("Please Enter valid answer, try again with: \"full or liability\"");
            coverage = input.next().toLowerCase();
            }

            System.out.println("Have you ever had any accidents or claims in the past 5 years (Yes/No)");
            String yesOrNo = input.next();
            while (!(yesOrNo.equals("yes") || yesOrNo.equals("no"))) {
                System.err.println("Please Enter valid answer, try again:");
                yesOrNo = input.next().toLowerCase();
            }

            System.out.println("Does car has an anti-theft device (Yes/No)");
            String yOrN = input.next();
            while (!(yOrN.equals("yes") || yOrN.equals("no"))) {
                System.err.println("Please Enter valid answer, try again:");
                yOrN = input.next().toLowerCase();
            }



            double totalPrice = 0;

            //this if condition for liability coverage


            if (coverage.equals("liability")) {
                if (age >= 25) {
                    totalPrice += 50;
                } else {
                    totalPrice += 90;
                }


                if (mile <= 10) {
                    totalPrice += 10;
                } else if (mile > 10 && mile <= 50) {
                    totalPrice += 30;
                } else {
                    totalPrice += 50;
                }
            }

            // this is for full coverage calculation

            if (coverage.equals("full")) {
                if (age >= 25) {
                    totalPrice += 120;
                } else {
                    totalPrice += 160;
                }


                if (mile <= 10) {
                    totalPrice += 20;
                } else if (mile > 10 && mile <= 50) {
                    totalPrice += 40;
                } else {
                    totalPrice += 70;
                }


                if (yOrN.equals("yes")) {
                    totalPrice *= 0.95;
                }

                if (yesOrNo.equals("yes")) {
                    totalPrice *= 1.15;
                } else {
                    totalPrice *= 0.90;
                }

                if (yes_no.equals("yes")) {
                    totalPrice *= 0.95;
                }

            }

            System.out.println("Your total price is: $" + totalPrice);


    }
}



/*
Create a class called InsuranceQuote, and write a program that can calculate the insurance
cost of a person based on the following info:
	    		1. Ask the user to enter your name
	    		2. Ask the user to enter your gender
	    			(if the user enters an invalid entry, ask the user to re-enter until
	    			the user provides a valid entry)
				3. Ask the user if he/she is married(Yes/No)
						(if the user enters an invalid entry, ask the user to re-enter until
						the user provides a valid entry)
				4. Ask the user to enter your age
						(age can not be negative or greater than 120)
						(if the user enters an invalid entry, ask the user to re-enter until
						the user provides a valid entry)
				5. Ask the user to enter how many miles he/she drives in a day
						(mileage can not be negative or less than 5)
						(if the user enters an invalid entry, ask the user to re-enter until
						the user provides a valid entry)
				6. Ask the user if he/she wants full coverage or liability insurance.

				7. Ask if he/she had any accidents or claims in the past 5 years (Yes/No)
						(if the user enters an invalid entry, ask the user to re-enter until
						the user provides a valid entry)

				8. Ask the user if his/her car has an anti-theft device (Yes/No)
						(if the user enters an invalid entry, ask the user to re-enter until
						the user provides a valid entry)

			Calculate the price of the insurance and display all the info of the user

				Insurance Quote calculation:
					starting prices for liability:
						age < 25 ===> 90
						age >= 25 ==> 50

						miles <= 10 ====> $10
					    miles > 10 and miles <= 50 ==> $30
					    miles > 50 ===>  $50

					starting prices for full coverage:
						age < 25 ===> 160
						age >= 25 ==> 120

						miles <= 10 ====> $20
					    miles > 10 and miles <= 50 ==> $40
					    miles > 50 ===>  $70


				    If the car has an anti-theft device ==> 5% discount
				    If he/she had any accidents or claims in the past 5 years ===> 15% extra charge
				    If he/she never had any accidents or claims in the past 5 years ==> 10% discount
				    If he/she is married ==> 5% discount

 */
