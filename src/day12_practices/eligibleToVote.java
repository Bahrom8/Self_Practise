package day12_practices;

public class eligibleToVote {

    public static void main(String[] args) {

        eligible( 23, true);
    }

    public static void eligible (int age, boolean isAmerican){

        if( age >= 18 && isAmerican == true){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible get your US passport");
        }
    }

}
/*
Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote

 */
