package week7.day1.database;

import week7.day1.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static List<Movie> Movies = new ArrayList<>();

    public static List<Movie> getMovies() {
        return Movies;
    }
}
