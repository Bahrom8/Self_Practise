package day13_practices;

public class OddNumber {
    public static void main(String[] args) {
        isOdd(4);
        isOdd(5);
    }

    public static void isOdd(int number){
        if(number % 2 != 0){
            System.out.println(number + " is Odd number");
        }else{
            System.out.println(number + " false");
        }
    }
}
/*
Create a method named isOdd, that can return true
if a number is an odd number, otherwise returns false
 */
