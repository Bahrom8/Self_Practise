package day24_practices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class LocalDateRemove {
    public static void main(String[] args) {

        ArrayList<LocalDate> list = new ArrayList<>();
        list.addAll(Arrays.asList(LocalDate.of(1996,7,27),
                LocalDate.of(2020,10,16),
                LocalDate.of(1999,8,8),
                LocalDate.of(2000,5,6),
                LocalDate.of(2017,12,31),
                LocalDate.of(2022,10,21)));


        list.removeIf(p-> p.isBefore(LocalDate.of(2016,8,15)));

        System.out.println(list);

    }
}
/*
create an Arraylist of LocalDate, and write a program
that can remove all the dates before August-15-2016
 */
