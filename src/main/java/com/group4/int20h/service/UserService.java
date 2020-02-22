package com.group4.int20h.service;

import com.group4.int20h.domain.User;
import com.group4.int20h.repo.UserRepo;

public class UserService extends AbstractCrudService<User, UserRepo> {
  public UserService(UserRepo repo) {
    super(repo);
  }
}
