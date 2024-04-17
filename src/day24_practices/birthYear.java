package day24_practices;

import java.time.LocalDate;

public class birthYear {

    public static boolean isLeapYear(int birthYear){
        return LocalDate.of(birthYear,1,1).isLeapYear();
    }

    public static void main(String[] args) {

        isLeapYear(1996);

    }

}
/*
Create a function that accepts an int argument birthYear,
return true if the person was born on leap year, otherwise return false
 */
