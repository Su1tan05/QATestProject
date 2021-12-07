package project.exceptions;

public class DriverError extends IllegalAccessError {
    public DriverError(String message) {
        super(message);
    }
}