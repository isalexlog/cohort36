package de.ait_tr.lesson_15_validation_error_handling.exception_handling.exceptions;

public class SavingProductException extends RuntimeException {

    public SavingProductException(String message, Throwable cause) {
        super(message, cause);
    }
}