package day13_practices;

public class minNumber {
    public static void main(String[] args) {
        minNum(1,8);
        minNum(26, 8);


    }
    public static void minNum (int num1, int num2){
        if( num1 < num2){
            System.out.println(num1 + " is minimum Number");
        }else{
            System.out.println(num1 + " is not minimum Number");
        }
    }
}
/*
Create a method named min,
that can return the minimum number between two numbers
 */
