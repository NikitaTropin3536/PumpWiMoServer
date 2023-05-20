package com.app.pumpwimo.pumpwimoapi.humans.response;

public class RestApiException extends RuntimeException {

    public RestApiException(String message) {
        super(message);
    }
}