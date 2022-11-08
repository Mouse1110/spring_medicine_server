package com.example.medicine.exception;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String mess){
        super(mess);
    }
}
