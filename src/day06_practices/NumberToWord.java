package day06_practices;

public class NumberToWord {
    public static void main(String[] args) {

        int number = 0;

        String writeNumber = "";

        boolean one = number == 1,
                two = number == 2,
                three = number == 3,
                four = number == 4,
                five = number == 5,
                six = number == 6,
                seven = number == 7,
                eight = number == 8,
                nine = number == 9,
                zero = number == 0;


        if (number == 1){
            writeNumber = "One";
        }
        if (number == 2){
            writeNumber = "Two";
        }
        if (number == 3){
            writeNumber = "Three";
        }
        if (number == 4){
            writeNumber = "Four";
        }
        if (number == 5){
            writeNumber = "Five";
        }
        if (number == 6){
            writeNumber = "Six";
        }
        if (number == 7){
            writeNumber = "Seven";
        }
        if (number == 8){
            writeNumber = "Eight";
        }
        if (number == 9){
            writeNumber = "Nine";
        }
        if (number == 0){
            writeNumber = "Zero";
        }

        System.out.println(writeNumber);


    }
}
/*
2. Create a  class named NumberToWord,
and write a Java program that can convert numbers between 0 ~ 9 into words
        Ex:
        number = 1;

        output:
        One

        Note: Do not use more than one print statement

 */
