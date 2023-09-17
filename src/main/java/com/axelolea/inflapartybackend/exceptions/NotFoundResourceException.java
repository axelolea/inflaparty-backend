package com.axelolea.inflapartybackend.exceptions;

public class NotFoundResourceException extends RuntimeException {
    public NotFoundResourceException(String message) {
        super(message);
    }

    public NotFoundResourceException(long id, String name) {
        super(name + " with Id " + id + " not founded.");
    }
}
