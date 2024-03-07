package day13_practices;

public class EvenNumber {
    public static void main(String[] args) {
        isEven(9);
        isEven(4);
    }
    public static void isEven (int number){
        if(number % 2 == 0){
            System.out.println(number + " is Even number");
        }else{
            System.out.println(number + " false");
        }
    }
}
/*
Create a method named isEven, that can return true
if a number is an even number, otherwise returns false
 */
