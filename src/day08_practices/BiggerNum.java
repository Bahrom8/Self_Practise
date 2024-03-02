package day08_practices;

public class BiggerNum {
    public static void main(String[] args) {
        int n1 = 10,
                n2 = 2,
                n3 = 3;
        String whichNumberIsBigger = (n1 > n2 && n1 > n3)? "n1 is Bigger"
                : (n2 > n1 && n2 > n3)? "n2 is Bigger":
                "n3 is Bigger";
        System.out.println(whichNumberIsBigger);



    }
}
/*
Create a class called BiggerNum, and write a program
that checks for bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1, n2 and n3

            if n1 is the biggest output: "n1 is bigger"
            if n2 is the biggest output: "n2 is bigger"
            if n3 is the biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY

 */
