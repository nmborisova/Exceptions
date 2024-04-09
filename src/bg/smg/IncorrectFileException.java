package bg.smg;

public class IncorrectFileException extends RuntimeException {
    public IncorrectFileException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}