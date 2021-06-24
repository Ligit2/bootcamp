package week7.day1.exception;

public class IllegalInputException extends Exception{
    private String message;

    public IllegalInputException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
