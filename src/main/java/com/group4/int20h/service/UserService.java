package com.group4.int20h.service;

import com.group4.int20h.domain.User;
import com.group4.int20h.exception.UserNotFoundException;
import com.group4.int20h.repo.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractCrudService<User, UserRepo> {
  public UserService(UserRepo repo) {
    super(repo);
  }

  public User validate(User user) {
    return repo.findByEmailAndPassword(user.getEmail(), user.getPassword()).orElseThrow(UserNotFoundException::new);
  }
}
