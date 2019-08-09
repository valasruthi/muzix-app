package com.stackroute.userservices.exception;

public class UserAlreadyExistException extends Exception {
  private String Message;

  public UserAlreadyExistException() {
  }

  public UserAlreadyExistException(String message) {
    super(message);
   this.Message = message;
  }




}
