package Coursework;

public class WrongRequestException extends RuntimeException{
    public WrongRequestException(String message) {
        super(message);
    }
}
