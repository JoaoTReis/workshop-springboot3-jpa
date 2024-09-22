package com.webservice.springService.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Object id) {
        super("Resource not Found. Id "+id);
    }
}
