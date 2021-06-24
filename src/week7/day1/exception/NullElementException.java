package week7.day1.exception;

public class NullElementException extends Exception {
    private String message;

    public NullElementException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
