package com.example.spring_boot3.exception;

import lombok.Setter;


public enum ErrorCode {
    UNCAUGHT_EXCEPTION(9999, "Uncaught exception"),
    USER_NOT_FOUND(1001, "User not found"),
    USER_ALREADY_EXISTS(1002, "User already exists"),
    INVALID_REQUEST(1003, "Invalid request"),
    INTERNAL_SERVER_ERROR(1004, "Internal server error"),
    USERNAME_INVALID(1005, "Username must be at least 5 characters long"),
    PASSWORD_INVALID(1006, "Password must be at least 8 characters long"),
    KEYWORD_INVALID(1007, "Invalid message keyword"),

;


    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
