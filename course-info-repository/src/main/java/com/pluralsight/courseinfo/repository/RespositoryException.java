package com.pluralsight.courseinfo.repository;

import java.sql.SQLException;

public class RespositoryException extends RuntimeException {
    // extending the runtime exception here takes out the obligation of handling the exception every time the method is called
    public RespositoryException(String message, SQLException e) {
        super(message, e);
    }
}
