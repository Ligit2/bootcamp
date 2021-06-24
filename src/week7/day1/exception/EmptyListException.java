package week7.day1.exception;

public class EmptyListException extends Exception {
    private String message;

    public EmptyListException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
