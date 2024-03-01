package day07_practices;

public class CrewAndPassenger {
    public static void main(String[] args) {


                int people = 101;

                String manifest = "";

                if (people == 50 || people == 75 || people == 100){
                    if (people==50){
                        manifest = "50 ==== > 20 crew, 30 passengers";
                    } else if (people==75) {
                        manifest = "75 ==== > 25 crew, 50 passengers";
                    } else if (people==100) {
                        manifest = "1000 ===> 30 crew, 70 passengers";
                    }
                } else {
                    manifest = "Number of people in ship not valid.";
                }

                System.out.println(manifest);

            }

        }
/*
Given the number of people on the ship (int number),
determine how many need to be crew members and how many can be passengers.
Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */

