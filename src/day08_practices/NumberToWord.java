package day08_practices;

public class NumberToWord {
    public static void main(String[] args) {


                int n = 1;

                String number = (n>=1 && n<=9)?
                        (n==1)?"One":(n==2)?"Two":(n==3)?"Three":(n==4)?"Four":(n==5)?"Five":
                                (n==6)?"Six":(n==7)?"Seven":(n==8)?"Eight":"Nine"
                        :"Nope";

                System.out.println(number);

            }

        }
/*
write a Java program that can convert numbers between 0 ~ and 9 to words
            Ex:
                number = 1;

            output:
                One

        Note: MUST use ternary

 */