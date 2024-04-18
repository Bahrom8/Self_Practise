package day25_practices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country, title, Genre;
    public LocalDate releaseDate;
    public String director;
    public ArrayList<String> casts;

    public Movie(String country, String title, String genre, LocalDate releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.Genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
        casts = new ArrayList<>();
    }

    public void addCasts(String[] names){
        casts.addAll(Arrays.asList(names));
    }

    public String toString() {
        return "\n\tMovie" +
                "\ncountry: " + country +
                "\ntitle: " + title +
                "\nGenre: " + Genre +
                "\nreleaseDate: " + releaseDate.format(DateTimeFormatter.ofPattern("MM/dd/y")) +
                "\ndirector: " + director +
                "\ncasts: " + casts;
    }
}
/*
Task04:
    1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the ArrayList casts
            addCasts(String[]): adds the given string array argument to the ArrayList casts
            toString(): returns the name of the country, title, release date, and the total number of casts

    2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/29/2023
                    Director: Kuzzat Altay
                    Casts: Ozzy, Jamal, Muhtar and 5 more students from your group

        print the full info of the movie

 */
