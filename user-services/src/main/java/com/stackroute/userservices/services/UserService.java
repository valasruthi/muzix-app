package com.stackroute.userservices.services;

import com.stackroute.userservices.domain.User;
import com.stackroute.userservices.exception.UserAlreadyExistException;

public interface UserService {
  public User saveUser(User user)throws UserAlreadyExistException;
  public User getUserById(int id);


}
