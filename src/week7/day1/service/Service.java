package week7.day1.service;

import week7.day1.controller.model.MovieRequest;
import week7.day1.database.DataBase;
import week7.day1.exception.EmptyListException;
import week7.day1.exception.IllegalInputException;
import week7.day1.model.Genre;
import week7.day1.model.Movie;

public class Service {
    public static void createMovie(MovieRequest movieRequest) throws IllegalInputException {
        checkName(movieRequest.getTitle());
        checkLength(movieRequest.getLength());
        Genre genre = checkGenre(movieRequest.getGenre());
        checkYear(movieRequest.getYear());
        int length = Integer.parseInt(movieRequest.getLength());
        int year = Integer.parseInt(movieRequest.getYear());
        Movie movie = new Movie(movieRequest.getTitle(), year, genre, getId(), length);
        DataBase.getMovies().add(movie);
    }

    public static void checkList() throws EmptyListException {
        if (DataBase.getMovies().size() == 0) {
            throw new EmptyListException("List is empty");
        }
    }

    public static void readAll() throws EmptyListException {
        checkList();
        for (int i = 0; i < DataBase.getMovies().size(); i++) {
            System.out.println(DataBase.getMovies().get(i));
        }
    }

    private static int getId() {
        int size = DataBase.getMovies().size();
        int previousId = 0;
        if (size != 0) {
            previousId = DataBase.getMovies().get(size - 1).getId();
        }
        previousId++;
        return previousId;
    }

    private static void checkName(String name) throws IllegalInputException {
        if (name.length() == 0 || name.length() > 30)
            throw new IllegalInputException("Title length is illegal");
    }

    private static void checkLength(String length) throws IllegalInputException {
        if(!checkString(length)) {
            throw new IllegalInputException("Illegal length");
        };
        int length1 = Integer.parseInt(length);
        if (length1 <= 0 || length1 > 10800) {
            throw new IllegalInputException("Illegal movie length");
        }
    }

    private static boolean checkString(String length) throws IllegalInputException {
        if (length.length() == 0) {
            return false;
        } else {
            for (int i = 0; i < length.length(); i++) {
                if (!(length.charAt(i) >= '0' && length.charAt(i) <= '9')) {
                   return false;
                }
            }
            if (length.charAt(0) == '0' && length.length() != 1) {
                return false;
            }
            return true;
        }
    }

    private static void checkYear(String year) throws IllegalInputException {
        if(!checkString(year)) {
            throw new IllegalInputException("Illegal year");
        };
        int year1 = Integer.parseInt(year);
        if (year1 > 2021 || year1 < 1650)
            throw new IllegalArgumentException("illegal year");
    }

    private static Genre checkGenre(String genre) throws IllegalInputException {
        if (genre.compareToIgnoreCase("thriller") == 0) {
            return Genre.THRILLER;
        } else if (genre.compareToIgnoreCase("horror") == 0) {
            return Genre.HORROR;
        } else if (genre.compareToIgnoreCase("comedy") == 0) {
            return Genre.COMEDY;
        } else if (genre.compareToIgnoreCase("romance") == 0) {
            return Genre.ROMANCE;
        } else if (genre.compareToIgnoreCase("drama") == 0) {
            return Genre.DRAMA;
        } else if (genre.compareToIgnoreCase("action") == 0) {
            return Genre.ACTION;
        } else if (genre.compareToIgnoreCase("fantasy") == 0) {
            return Genre.FANTASY;
        } else {
            throw new IllegalInputException("No such genre");
        }
    }

    public static void removeById(int id) throws IllegalInputException {
        checkId(id);
        for (int i = 0; i < DataBase.getMovies().size(); i++) {
            if (DataBase.getMovies().get(i).getId() == id) {
                DataBase.getMovies().remove(i);
                return;
            }
        }
    }

    public static void checkId(int id) throws IllegalInputException {
        if (id < 0 || id > DataBase.getMovies().size())
            throw new IllegalInputException("illegal Id");
    }

    public static void readById(int id) throws IllegalInputException {
        checkId(id);
        for (int i = 0; i < DataBase.getMovies().size(); i++) {
            if (DataBase.getMovies().get(i).getId() == id) {
                System.out.println(DataBase.getMovies().get(i));
                return;
            }
        }
    }

    public static void updateMovie(MovieRequest movieRequest, int Id) throws IllegalInputException {
        for (int i = 0; i < DataBase.getMovies().size(); i++) {
            if (DataBase.getMovies().get(i).getId() == Id) {
                convertMovieRequestToMovie(movieRequest, DataBase.getMovies().get(i));
            }
        }
    }

    private static void convertMovieRequestToMovie(MovieRequest movieRequest, Movie movie) throws IllegalInputException {
        if (movieRequest.getTitle() != null) {
            checkName(movieRequest.getTitle());
            movie.setTitle(movieRequest.getTitle());
        }
        if (movieRequest.getGenre() != null) {
            movie.setGenre(checkGenre(movieRequest.getGenre()));
        }
        if (movieRequest.getLength() != null) {
            checkLength(movieRequest.getLength());
            int length = Integer.parseInt(movieRequest.getLength());
            movie.setLength(length);
        }
        if (movieRequest.getYear() != null) {
            checkYear(movieRequest.getYear());
            int year = Integer.parseInt(movieRequest.getYear());
            movie.setYear(year);
        }
    }
}
