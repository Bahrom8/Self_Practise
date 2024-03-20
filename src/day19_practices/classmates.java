package day19_practices;

import java.util.Arrays;

public class classmates {

    public static void main(String[] args) {

        String[] classmates = new String[10];

        classmates[0] = "Madina Tadzhibaeva";
        classmates[1] = "Michelle-Inanir Sobrino";
        classmates[2] = "Rustam Royeen";
        classmates[3] = "Bizhan Qaderi";
        classmates[4] = "Assiya Tuleshova";
        classmates[5] = "Zhibek Orozbekova";
        classmates[6] = "Nazgul Sydykova";
        classmates[7] = "Farah Qaderi";
        classmates[8] = "Emanuel Ifraimov";
        classmates[9] = "Moldir Saidykarim";

        for (int i = classmates.length - 1; i >= 0; i--) {
            System.out.println((classmates[i] ));
        }

        System.out.println("\n\tInitials of mu classmates: \n");

        for (String eachInitials : classmates) {
            System.out.println(eachInitials.charAt(0) + "." + eachInitials.charAt(eachInitials.lastIndexOf(" ")+1));
        }
    }
}
/*
create an array of named classmates, and store 10 of your classmates' full names
            print the initials of each classmate in separate lines
 */
