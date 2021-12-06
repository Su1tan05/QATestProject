package Project.Exceptions;

public class DriverError extends IllegalAccessError {
    public DriverError(String message) {
        super(message);
    }
}