package day25_practices;

import java.time.LocalDate;

public class MovieObject {

    public static void main(String[] args) {

        String[] casts = {"Ozzy", "Ali", "Muhtar", "Michelle", "Madina", "Rustam", "Bizhan","Assiya"};

        Movie movie1 = new Movie("USA", "Java Developer: Zero to Hero", "Advenure, Comedy, Thriller",
                LocalDate.of(2023,10,29), "Kuzzat Altay");
        movie1.addCasts(casts);

        System.out.println(movie1);

    }

}
