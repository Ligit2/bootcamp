package week7.day1.model;

public class Movie {
    private String title;
    private int year;
    private Genre genre;
    private int id;
    private int length;

    public Movie(String title, int year, Genre genre, int id, int length) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.id = id;
        this.length = length;
    }

    public Movie() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", genre=" + genre +
                ", id=" + id +
                ", length=" + length +
                '}';
    }
}
