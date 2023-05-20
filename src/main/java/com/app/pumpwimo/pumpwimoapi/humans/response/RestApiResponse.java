package com.app.pumpwimo.pumpwimoapi.humans.response;

import lombok.Data;

@Data
public class RestApiResponse {
    private int status;
    private String message;
    private Object data;

    public RestApiResponse(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public RestApiResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }
}