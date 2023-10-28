package chapters.chapter10;

public class StudentNotFoundExeption extends Exception {
    public StudentNotFoundExeption() {
    }

    public StudentNotFoundExeption(String message) {
        super(message);
    }

    public StudentNotFoundExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundExeption(Throwable cause) {
        super(cause);
    }

    public StudentNotFoundExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
