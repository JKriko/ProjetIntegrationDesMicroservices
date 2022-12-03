package com.code.fukkstackbackend.exception;


public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String matricule){
        super("Could not found the user with matricule "+ matricule);
    }
}