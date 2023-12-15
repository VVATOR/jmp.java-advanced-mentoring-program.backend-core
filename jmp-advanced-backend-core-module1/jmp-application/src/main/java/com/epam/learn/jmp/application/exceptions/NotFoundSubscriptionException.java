package com.epam.learn.jmp.application.exceptions;

public class NotFoundSubscriptionException extends RuntimeException {
    public NotFoundSubscriptionException(String message) {
        super(message);
    }
}
